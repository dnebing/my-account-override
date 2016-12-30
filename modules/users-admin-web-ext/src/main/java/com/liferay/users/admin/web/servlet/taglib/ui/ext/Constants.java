package com.liferay.users.admin.web.servlet.taglib.ui.ext;

import com.liferay.admin.kernel.util.PortalMyAccountApplicationType;
import com.liferay.portal.kernel.portlet.PortletProvider;
import com.liferay.portal.kernel.portlet.PortletProviderUtil;

/**
 * Created by dnebinger on 12/29/16.
 */
public class Constants {
	public static final String MY_ACCOUNT_PASSWORD_VISIBLE = "my.account.password.visible";
	public static final String MY_ACCOUNT_ADDRESSES_VISIBLE = "my.account.addresses.visible";
	public static final String MY_ACCOUNT_ADDITIONAL_EMAIL_VISIBLE = "my.account.additional.email.visible";
	public static final String MY_ACCOUNT_ANNOUNCEMENTS_VISIBLE = "my.account.announcements.visible";
	public static final String MY_ACCOUNT_CATEGORIZATION_VISIBLE = "my.account.categorization.visible";
	public static final String MY_ACCOUNT_COMMENTS_VISIBLE = "my.account.comments.visible";
	public static final String MY_ACCOUNT_CUSTOM_FIELDS_VISIBLE = "my.account.custom.fields.visible";
	public static final String MY_ACCOUNT_DETAILS_VISIBLE = "my.account.details.visible";
	public static final String MY_ACCOUNT_DISPLAY_SETTINGS_VISIBLE = "my.account.display.settings.visible";
	public static final String MY_ACCOUNT_INSTANT_MESSENGER_VISIBLE = "my.account.instant.messenger.visible";
	public static final String MY_ACCOUNT_OPEN_ID_VISIBLE = "my.account.open.id.visible";
	public static final String MY_ACCOUNT_ORGANIZATIONS_VISIBLE = "my.account.organizations.visible";
	public static final String MY_ACCOUNT_PERSONAL_SITE_VISIBLE = "my.account.personal.site.visible";
	public static final String MY_ACCOUNT_PHONE_NUMBERS_VISIBLE = "my.account.phone.numbers.visible";
	public static final String MY_ACCOUNT_ROLES_VISIBLE = "my.account.roles.visible";
	public static final String MY_ACCOUNT_SITES_VISIBLE = "my.account.sites.visible";
	public static final String MY_ACCOUNT_SMS_VISIBLE = "my.account.sms.visible";
	public static final String MY_ACCOUNT_SOCIAL_NETWORK_VISIBLE = "my.account.social.network.visible";
	public static final String MY_ACCOUNT_USER_GROUPS_VISIBLE = "my.account.user.groups.visible";
	public static final String MY_ACCOUNT_WEBSITES_VISIBLE = "my.account.websites.visible";

	public static final String MY_ACCOUNT_PREFIX = 	"my.account.";

	public static final String _myAccountPortletId = PortletProviderUtil.getPortletId(PortalMyAccountApplicationType.MyAccount.CLASS_NAME, PortletProvider.Action.VIEW);
}
