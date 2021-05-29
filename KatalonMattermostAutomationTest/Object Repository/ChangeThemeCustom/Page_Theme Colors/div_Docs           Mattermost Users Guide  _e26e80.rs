<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Docs           Mattermost Users Guide  _e26e80</name>
   <tag></tag>
   <elementGuidId>0be47378-e455-4136-b366-b3853ebf6218</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>(.//*[normalize-space(text()) and normalize-space(.)='Mattermost'])[2]/following::div[2]</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>div.rst-content</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>rst-content</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
        
          


  



  
    Docs »
    
      Mattermost User’s Guide »
    
    Theme Colors
    
      
        
           Edit
        
      
    
  
  

          
           
            
  
Theme Colors¶
The colors of the Mattermost user interface are customizable in Account Settings > Display > Theme. You can import your theme colors from Slack, customize the colors yourself, or choose from four standard themes designed by the Mattermost team.
Any color changes you make are applied to all teams that you belong to. In Enterprise Edition, you can choose to apply the theme to the current team only, allowing you to have a different theme for each team.

Import Theme from Slack¶
To import a theme, in Slack, go to Preferences > Themes, select Create a custom theme, then copy the theme color values.
In Mattermost, select Import theme colors from Slack, then paste the color values into the input box and select Submit. Any theme settings that are not customizable in Slack will default to the “Mattermost” standard theme settings. Select Save to confirm your theme changes.


Custom Themes¶
Select Custom Theme, then expand the Sidebar Styles, Center Channel Styles, and Link and Button Styles options to customize individual interface colors, such as backgrounds, links, text, and borders.
Your custom theme changes are applied in Mattermost as you make them. Select Save to confirm your theme changes. Discard your changes by exiting the Display Settings window and selecting Yes, Discard.


Standard Themes¶
Select Theme Colors to choose from four standard themes designed by the Mattermost team. To make custom adjustments on the four standard theme colors, select a standard theme, then select Custom Theme to further customize that standard theme based on your preferences. Select Save to confirm your theme changes.

Sidebar Styles¶

Sidebar BGBackground color of the Channels pane, and Account and Team settings navigation sidebars.

Sidebar TextText color of read channels in the Channels pane, and tabs in the Account and Team settings navigation sidebar.

Sidebar Header BGBackground color of the header above the Channels pane and all dialog window headers.

Sidebar Header TextText color of the header above the Channels pane and all dialog window headers.

Sidebar Unread TextText color of unread channels in the Channels pane.

Sidebar Text Hover BGBackground color behind channel names and settings tabs as you hover over them.

Sidebar Text Active BorderColor of the rectangular marker on the left side of the Channels pane or Settings sidebar indicating the active channel or tab.

Sidebar Text Active ColorText color of the active channel or tab in the Channels pane or Settings sidebar.

Online IndicatorColor of the online indicator appearing next to team members names in the Direct Messages list.

Away IndicatorColor of the away indicator appearing next to team members names in the Direct Messages list when they have had no browser activity for 5 minutes.

Do Not Disturb IndicatorColor of the do not disturb indicator appearing next to team members names in the Direct Messages list.

Mention Jewel BGBackground color of the jewel indicating unread mentions that appears to the right of the channel name. This is also the background color of the “Unread Posts Below/Above” indicator appearing at the top or bottom of the Channels pane on shorter browser windows.

Mention Jewel TextText color on the mention jewel indicating the number of unread mentions. This is also the text color on the “Unread Posts Below/Above” indicator.




Center Channel Styles¶

Center Channel BGColor of the center pane, right-hand sidebar and all dialog window backgrounds.

Center Channel TextColor of all the text - with the exception of mentions, links, hashtags and code blocks - in the center pane, right-hand sidebar, and dialogs.

New Message SeparatorThe new message separator appears below the last read message when you switch to a channel with unread messages.

Error Text ColorColor of all error text.

Mention Highlight BGHighlight color behind your words that trigger mentions in the center pane and right-hand sidebar.

Mention Highlight LinkText color of your words that trigger mentions in the center pane and right-hand sidebar.

Code ThemeBackground and syntax colors for all code blocks.




Link and Button Styles¶

Link ColorText color of all links, hashtags, teammate mentions, and low priority UI buttons.

Button BGColor of the rectangular background behind all high priority UI buttons.

Button TextText color appearing on the rectangular background for all high priority UI buttons.




Exporting a Custom Theme¶
You can export a theme from Mattermost by copying the theme values from the Custom Theme menu.
Go to Account Settings > Display > Custom Theme, then select Copy Theme Colors to export the theme’s color values.


Importing a Custom Theme¶
You can import a theme into Mattermost by pasting the theme values into the Custom Theme menu.
Copy existing theme values, then go to Account Settings > Display > Custom Theme to paste the theme values into the Copy and paste to share theme colors field. Select Save to confirm your theme changes.


Custom Theme Examples¶
Customize your theme colors and share them with others by copying and pasting theme values into the input box. Below are some example themes with their corresponding theme values.

GitHub theme¶

{&quot;awayIndicator&quot;:&quot;#D4B579&quot;,&quot;buttonBg&quot;:&quot;#66CCCC&quot;,&quot;buttonColor&quot;:&quot;#FFFFFF&quot;,&quot;centerChannelBg&quot;:&quot;#FFFFFF&quot;,&quot;centerChannelColor&quot;:&quot;#444444&quot;,&quot;codeTheme&quot;:&quot;github&quot;,&quot;linkColor&quot;:&quot;#3DADAD&quot;,&quot;mentionBg&quot;:&quot;#66CCCC&quot;,&quot;mentionColor&quot;:&quot;#FFFFFF&quot;,&quot;mentionHighlightBg&quot;:&quot;#3DADAD&quot;,&quot;mentionHighlightLink&quot;:&quot;#FFFFFF&quot;,&quot;newMessageSeparator&quot;:&quot;#F2777A&quot;,&quot;onlineIndicator&quot;:&quot;#52ADAD&quot;,&quot;sidebarBg&quot;:&quot;#F2F0EC&quot;,&quot;sidebarHeaderBg&quot;:&quot;#E8E6DF&quot;,&quot;sidebarHeaderTextColor&quot;:&quot;#424242&quot;,&quot;sidebarText&quot;:&quot;#2E2E2E&quot;,&quot;sidebarTextActiveBorder&quot;:&quot;#66CCCC&quot;,&quot;sidebarTextActiveColor&quot;:&quot;#594545&quot;,&quot;sidebarTextHoverBg&quot;:&quot;#E0E0E0&quot;,&quot;sidebarUnreadText&quot;:&quot;#515151&quot;}




Monokai theme¶

{&quot;awayIndicator&quot;:&quot;#B8B884&quot;,&quot;buttonBg&quot;:&quot;#90AD58&quot;,&quot;buttonColor&quot;:&quot;#FFFFFF&quot;,&quot;centerChannelBg&quot;:&quot;#FFFFFF&quot;,&quot;centerChannelColor&quot;:&quot;#444444&quot;,&quot;codeTheme&quot;:&quot;monokai&quot;,&quot;linkColor&quot;:&quot;#90AD58&quot;,&quot;mentionBg&quot;:&quot;#7E9949&quot;,&quot;mentionColor&quot;:&quot;#FFFFFF&quot;,&quot;mentionHighlightBg&quot;:&quot;#54850C&quot;,&quot;mentionHighlightLink&quot;:&quot;#FFFFFF&quot;,&quot;newMessageSeparator&quot;:&quot;#90AD58&quot;,&quot;onlineIndicator&quot;:&quot;#99CB3F&quot;,&quot;sidebarBg&quot;:&quot;#262626&quot;,&quot;sidebarHeaderBg&quot;:&quot;#363636&quot;,&quot;sidebarHeaderTextColor&quot;:&quot;#FFFFFF&quot;,&quot;sidebarText&quot;:&quot;#FFFFFF&quot;,&quot;sidebarTextActiveBorder&quot;:&quot;#7E9949&quot;,&quot;sidebarTextActiveColor&quot;:&quot;#FFFFFF&quot;,&quot;sidebarTextHoverBg&quot;:&quot;#525252&quot;,&quot;sidebarUnreadText&quot;:&quot;#CCCCCC&quot;}




Solarized Dark theme¶

{&quot;awayIndicator&quot;:&quot;#E0B333&quot;,&quot;buttonBg&quot;:&quot;#859900&quot;,&quot;buttonColor&quot;:&quot;#fdf6e3&quot;,&quot;centerChannelBg&quot;:&quot;#073642&quot;,&quot;centerChannelColor&quot;:&quot;#93a1a1&quot;,&quot;codeTheme&quot;:&quot;solarized-dark&quot;,&quot;linkColor&quot;:&quot;#268bd2&quot;,&quot;mentionBg&quot;:&quot;#dc322f&quot;,&quot;mentionColor&quot;:&quot;#ffffff&quot;,&quot;mentionHighlightBg&quot;:&quot;#d33682&quot;,&quot;mentionHighlightLink&quot;:&quot;#268bd2&quot;,&quot;newMessageSeparator&quot;:&quot;#cb4b16&quot;,&quot;onlineIndicator&quot;:&quot;#2AA198&quot;,&quot;sidebarBg&quot;:&quot;#073642&quot;,&quot;sidebarHeaderBg&quot;:&quot;#002B36&quot;,&quot;sidebarHeaderTextColor&quot;:&quot;#FDF6E3&quot;,&quot;sidebarText&quot;:&quot;#FDF6E3&quot;,&quot;sidebarTextActiveBorder&quot;:&quot;#d33682&quot;,&quot;sidebarTextActiveColor&quot;:&quot;#FDF6E3&quot;,&quot;sidebarTextHoverBg&quot;:&quot;#CB4B16&quot;,&quot;sidebarUnreadText&quot;:&quot;#FDF6E3&quot;,&quot;errorTextColor&quot;:&quot;#dc322f&quot;}




Gruvbox Dark theme¶

{&quot;awayIndicator&quot;:&quot;#fabd2f&quot;,&quot;buttonBg&quot;:&quot;#689d6a&quot;,&quot;buttonColor&quot;:&quot;#ebdbb2&quot;,&quot;centerChannelBg&quot;:&quot;#3c3836&quot;,&quot;centerChannelColor&quot;:&quot;#ebdbb2&quot;,&quot;codeTheme&quot;:&quot;monokai&quot;,&quot;errorTextColor&quot;:&quot;#fb4934&quot;,&quot;linkColor&quot;:&quot;#83a598&quot;,&quot;mentionBg&quot;:&quot;#b16286&quot;,&quot;mentionColor&quot;:&quot;#fbf1c7&quot;,&quot;mentionHighlightBg&quot;:&quot;#d65d0e&quot;,&quot;mentionHighlightLink&quot;:&quot;#fbf1c7&quot;,&quot;newMessageSeparator&quot;:&quot;#d65d0e&quot;,&quot;onlineIndicator&quot;:&quot;#b8bb26&quot;,&quot;sidebarBg&quot;:&quot;#282828&quot;,&quot;sidebarHeaderBg&quot;:&quot;#1d2021&quot;,&quot;sidebarHeaderTextColor&quot;:&quot;#ebdbb2&quot;,&quot;sidebarText&quot;:&quot;#ebdbb2&quot;,&quot;sidebarTextActiveBorder&quot;:&quot;#d65d0e&quot;,&quot;sidebarTextActiveColor&quot;:&quot;#fbf1c7&quot;,&quot;sidebarTextHoverBg&quot;:&quot;#d65d0e&quot;,&quot;sidebarUnreadText&quot;:&quot;#fe8019&quot;}




One Dark¶

GitHub
{&quot;sidebarBg&quot;:&quot;#21252b&quot;,&quot;sidebarText&quot;:&quot;#abb2bf&quot;,&quot;sidebarUnreadText&quot;:&quot;#abb2bf&quot;,&quot;sidebarTextHoverBg&quot;:&quot;#3a3f4b&quot;,&quot;sidebarTextActiveBorder&quot;:&quot;#4d78cc&quot;,&quot;sidebarTextActiveColor&quot;:&quot;#d7dae0&quot;,&quot;sidebarHeaderBg&quot;:&quot;#282c34&quot;,&quot;sidebarHeaderTextColor&quot;:&quot;#abb2bf&quot;,&quot;onlineIndicator&quot;:&quot;#98c379&quot;,&quot;awayIndicator&quot;:&quot;#d19a66&quot;,&quot;dndIndicator&quot;:&quot;#be5046&quot;,&quot;mentionBg&quot;:&quot;#98c379&quot;,&quot;mentionColor&quot;:&quot;#ffffff&quot;,&quot;centerChannelBg&quot;:&quot;#282c34&quot;,&quot;centerChannelColor&quot;:&quot;#abb2bf&quot;,&quot;newMessageSeparator&quot;:&quot;#c67add&quot;,&quot;linkColor&quot;:&quot;#61afef&quot;,&quot;buttonBg&quot;:&quot;#4d78cc&quot;,&quot;buttonColor&quot;:&quot;#ffffff&quot;,&quot;errorTextColor&quot;:&quot;#f44747&quot;,&quot;mentionHighlightBg&quot;:&quot;#525a69&quot;,&quot;mentionHighlightLink&quot;:&quot;#61afef&quot;,&quot;codeTheme&quot;:&quot;monokai&quot;,&quot;mentionBg&quot;:&quot;#98c379&quot;}




Discord Dark Theme¶

GitHub
{&quot;sidebarBg&quot;:&quot;#2f3136&quot;,&quot;sidebarText&quot;:&quot;#ffffff&quot;,&quot;sidebarUnreadText&quot;:&quot;#ffffff&quot;,&quot;sidebarTextHoverBg&quot;:&quot;#33363c&quot;,&quot;sidebarTextActiveBorder&quot;:&quot;#66cfa0&quot;,&quot;sidebarTextActiveColor&quot;:&quot;#ffffff&quot;,&quot;sidebarHeaderBg&quot;:&quot;#27292c&quot;,&quot;sidebarHeaderTextColor&quot;:&quot;#ffffff&quot;,&quot;onlineIndicator&quot;:&quot;#43b581&quot;,&quot;awayIndicator&quot;:&quot;#faa61a&quot;,&quot;dndIndicator&quot;:&quot;#f04747&quot;,&quot;mentionBg&quot;:&quot;#6e84d2&quot;,&quot;mentionBg&quot;:&quot;#6e84d2&quot;,&quot;mentionColor&quot;:&quot;#ffffff&quot;,&quot;centerChannelBg&quot;:&quot;#36393f&quot;,&quot;centerChannelColor&quot;:&quot;#dddddd&quot;,&quot;newMessageSeparator&quot;:&quot;#6e84d2&quot;,&quot;linkColor&quot;:&quot;#2095e8&quot;,&quot;buttonBg&quot;:&quot;#43b581&quot;,&quot;buttonColor&quot;:&quot;#ffffff&quot;,&quot;errorTextColor&quot;:&quot;#ff6461&quot;,&quot;mentionHighlightBg&quot;:&quot;#3d414f&quot;,&quot;mentionHighlightLink&quot;:&quot;#6e84d2&quot;,&quot;codeTheme&quot;:&quot;monokai&quot;}




Night Owl Dark theme¶

{&quot;sidebarBg&quot;:&quot;#011627&quot;,&quot;sidebarText&quot;:&quot;#d6deeb&quot;,&quot;sidebarUnreadText&quot;:&quot;#d6deeb&quot;,&quot;sidebarTextHoverBg&quot;:&quot;#1d3b53&quot;,&quot;sidebarTextActiveBorder&quot;:&quot;#ff2c83&quot;,&quot;sidebarTextActiveColor&quot;:&quot;#82aaff&quot;,&quot;sidebarHeaderBg&quot;:&quot;#1d3b53&quot;,&quot;sidebarHeaderTextColor&quot;:&quot;#d6deeb&quot;,&quot;onlineIndicator&quot;:&quot;#addb67&quot;,&quot;awayIndicator&quot;:&quot;#ffbc42&quot;,&quot;dndIndicator&quot;:&quot;#f74343&quot;,&quot;mentionBg&quot;:&quot;#d6deeb&quot;,&quot;mentionBg&quot;:&quot;#d6deeb&quot;,&quot;mentionColor&quot;:&quot;#145dbf&quot;,&quot;centerChannelBg&quot;:&quot;#011627&quot;,&quot;centerChannelColor&quot;:&quot;#d6deeb&quot;,&quot;newMessageSeparator&quot;:&quot;#ff8800&quot;,&quot;linkColor&quot;:&quot;#2389d7&quot;,&quot;buttonBg&quot;:&quot;#166de0&quot;,&quot;buttonColor&quot;:&quot;#011627&quot;,&quot;errorTextColor&quot;:&quot;#fd5960&quot;,&quot;mentionHighlightBg&quot;:&quot;#0b2942&quot;,&quot;mentionHighlightLink&quot;:&quot;#82aaff&quot;,&quot;codeTheme&quot;:&quot;solarized-dark&quot;}








           
           
          
          
    
        Next 
         Previous
    

  

  
    
        © Copyright 2015-2021 Mattermost.

    
  
    
    
    
    Built with Sphinx using a
    
    theme
    
    provided by Read the Docs. 


        </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[@class=&quot;no-js&quot;]/body[@class=&quot;wy-body-for-nav&quot;]/div[@class=&quot;wy-grid-for-nav&quot;]/section[@class=&quot;wy-nav-content-wrap&quot;]/div[@class=&quot;wy-nav-content&quot;]/div[@class=&quot;rst-content&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Mattermost'])[2]/following::div[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)=concat('Developer', &quot;'&quot;, 's Guide')])[1]/following::div[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//section/div/div</value>
   </webElementXpaths>
</WebElementEntity>
