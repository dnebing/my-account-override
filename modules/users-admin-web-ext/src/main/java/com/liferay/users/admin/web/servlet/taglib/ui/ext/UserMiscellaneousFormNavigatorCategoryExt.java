package com.liferay.users.admin.web.servlet.taglib.ui.ext;

import com.liferay.portal.kernel.servlet.taglib.ui.FormNavigatorCategory;
import com.liferay.users.admin.web.servlet.taglib.ui.UserMiscellaneousFormNavigatorCategory;
import org.osgi.service.component.annotations.Component;

/**
 * Created by dnebinger on 12/30/16.
 */
@Component(
	property = {"form.navigator.category.order:Integer=10"},
	service = FormNavigatorCategory.class
)
public class UserMiscellaneousFormNavigatorCategoryExt extends UserMiscellaneousFormNavigatorCategory {
	@Override
	public String getFormNavigatorId() {
		return Constants.MY_ACCOUNT_PREFIX + super.getFormNavigatorId();
	}
}
