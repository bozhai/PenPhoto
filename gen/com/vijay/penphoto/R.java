/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.vijay.penphoto;

public final class R {
    public static final class attr {
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int buttonBarButtonStyle=0x7f010001;
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int buttonBarStyle=0x7f010000;
    }
    public static final class color {
        public static final int black_overlay=0x7f040000;
    }
    public static final class drawable {
        public static final int ic_launcher=0x7f020000;
        public static final int play_button=0x7f020001;
    }
    public static final class id {
        public static final int cancel_button=0x7f08000a;
        public static final int close=0x7f08000f;
        public static final int confirm_password=0x7f080008;
        public static final int email=0x7f080003;
        public static final int listview=0x7f08000c;
        public static final int login=0x7f080005;
        public static final int login_form=0x7f080002;
        public static final int login_status=0x7f080000;
        public static final int login_status_message=0x7f080001;
        public static final int main_layout=0x7f08000b;
        public static final int menu_forgot_password=0x7f080015;
        public static final int menu_settings=0x7f080016;
        public static final int pager=0x7f08000d;
        public static final int pager_title_strip=0x7f08000e;
        public static final int password=0x7f080004;
        public static final int pause=0x7f080012;
        public static final int play=0x7f080011;
        public static final int play_button=0x7f080014;
        public static final int prefs_logout=0x7f080017;
        public static final int register_button=0x7f080007;
        public static final int register_button_layout=0x7f080009;
        public static final int sign_in_button=0x7f080006;
        public static final int title=0x7f080013;
        public static final int video=0x7f080010;
    }
    public static final class layout {
        public static final int activity_login=0x7f030000;
        public static final int activity_login_register=0x7f030001;
        public static final int activity_main=0x7f030002;
        public static final int activity_pene_photo=0x7f030003;
        public static final int activity_video_player=0x7f030004;
        public static final int row_content=0x7f030005;
    }
    public static final class menu {
        public static final int activity_login=0x7f070000;
        public static final int activity_main=0x7f070001;
        public static final int activity_pene_photo=0x7f070002;
    }
    public static final class string {
        public static final int action_sign_in_register=0x7f05000e;
        public static final int action_sign_in_short=0x7f05000f;
        public static final int app_name=0x7f050000;
        public static final int dummy_button=0x7f050008;
        public static final int dummy_content=0x7f050007;
        public static final int error_field_required=0x7f050015;
        public static final int error_incorrect_password=0x7f050014;
        public static final int error_invalid_email=0x7f050012;
        public static final int error_invalid_password=0x7f050013;
        public static final int login_progress_signing_in=0x7f050011;
        public static final int menu_forgot_password=0x7f050010;
        public static final int menu_settings=0x7f050006;
        public static final int prefs_logout=0x7f05000a;
        /**  Strings related to login 
         */
        public static final int prompt_email=0x7f05000c;
        public static final int prompt_password=0x7f05000d;
        public static final int register=0x7f050016;
        public static final int title_activity_login=0x7f05000b;
        public static final int title_activity_pene_photo=0x7f050004;
        public static final int title_activity_register=0x7f050005;
        public static final int title_activity_video_player=0x7f050009;
        public static final int title_section1=0x7f050003;
        public static final int title_section2=0x7f050002;
        public static final int title_section3=0x7f050001;
    }
    public static final class style {
        /** 
        Base application theme, dependent on API level. This theme is replaced
        by AppBaseTheme from res/values-vXX/styles.xml on newer devices.
    

            Theme customizations available in newer API levels can go in
            res/values-vXX/styles.xml, while customizations related to
            backward-compatibility can go here.
        

        Base application theme for API 11+. This theme completely replaces
        AppBaseTheme from res/values/styles.xml on API 11+ devices.
    
 API 11 theme customizations can go here. 

        Base application theme for API 14+. This theme completely replaces
        AppBaseTheme from BOTH res/values/styles.xml and
        res/values-v11/styles.xml on API 14+ devices.
    
 API 14 theme customizations can go here. 
         */
        public static final int AppBaseTheme=0x7f060000;
        /**  Application theme. 
 All customizations that are NOT specific to a particular API-level can go here. 
         */
        public static final int AppTheme=0x7f060001;
        public static final int ButtonBar=0x7f060004;
        public static final int ButtonBarButton=0x7f060003;
        public static final int FullscreenActionBarStyle=0x7f060006;
        public static final int FullscreenTheme=0x7f060005;
        public static final int LoginFormContainer=0x7f060002;
    }
    public static final class styleable {
        /** 
         Declare custom theme attributes that allow changing which styles are
         used for button bars depending on the API level.
         ?android:attr/buttonBarStyle is new as of API 11 so this is
         necessary to support previous API levels.
    
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #ButtonBarContainerTheme_buttonBarButtonStyle com.vijay.penphoto:buttonBarButtonStyle}</code></td><td></td></tr>
           <tr><td><code>{@link #ButtonBarContainerTheme_buttonBarStyle com.vijay.penphoto:buttonBarStyle}</code></td><td></td></tr>
           </table>
           @see #ButtonBarContainerTheme_buttonBarButtonStyle
           @see #ButtonBarContainerTheme_buttonBarStyle
         */
        public static final int[] ButtonBarContainerTheme = {
            0x7f010000, 0x7f010001
        };
        /**
          <p>This symbol is the offset where the {@link com.vijay.penphoto.R.attr#buttonBarButtonStyle}
          attribute's value can be found in the {@link #ButtonBarContainerTheme} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name android:buttonBarButtonStyle
        */
        public static final int ButtonBarContainerTheme_buttonBarButtonStyle = 1;
        /**
          <p>This symbol is the offset where the {@link com.vijay.penphoto.R.attr#buttonBarStyle}
          attribute's value can be found in the {@link #ButtonBarContainerTheme} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name android:buttonBarStyle
        */
        public static final int ButtonBarContainerTheme_buttonBarStyle = 0;
    };
}
