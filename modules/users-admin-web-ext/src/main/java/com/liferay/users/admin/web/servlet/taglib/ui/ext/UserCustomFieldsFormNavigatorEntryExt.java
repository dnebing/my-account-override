package com.liferay.users.admin.web.servlet.taglib.ui.ext;

import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.servlet.taglib.ui.FormNavigatorEntry;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.users.admin.web.servlet.taglib.ui.UserCustomFieldsFormNavigatorEntry;
import org.osgi.service.component.annotations.Component;

/**
 * Created by dnebinger on 12/30/16.
 */
@Component(
	property = {"form.navigator.entry.order:Integer=10"},
	service = FormNavigatorEntry.class
)
public class UserCustomFieldsFormNavigatorEntryExt extends UserCustomFieldsFormNavigatorEntry {
	private boolean visible = GetterUtil.getBoolean(PropsUtil.get(Constants.MY_ACCOUNT_CUSTOM_FIELDS_VISIBLE), true);

	@Override
	public String getFormNavigatorId() {
		return Constants.MY_ACCOUNT_PREFIX + super.getFormNavigatorId();
	}

	@Override
	public boolean isVisible(User user, User selUser) {
		return visible && super.isVisible(user, selUser);
	}
}
