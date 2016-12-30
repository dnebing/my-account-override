package com.liferay.users.admin.web.servlet.taglib.ui.ext;

import com.liferay.portal.kernel.servlet.taglib.ui.FormNavigatorCategory;
import com.liferay.users.admin.web.servlet.taglib.ui.UserIdentificationFormNavigatorCategory;
import org.osgi.service.component.annotations.Component;

/**
 * Created by dnebinger on 12/30/16.
 */
@Component(
	property = {"form.navigator.category.order:Integer=20"},
	service = FormNavigatorCategory.class
)
public class UserIdentificationFormNavigatorCategoryExt extends UserIdentificationFormNavigatorCategory {
	@Override
	public String getFormNavigatorId() {
		return Constants.MY_ACCOUNT_PREFIX + super.getFormNavigatorId();
	}
}
