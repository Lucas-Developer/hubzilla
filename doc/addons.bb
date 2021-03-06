[h3]Plugins/Addons[/h3]
[list=1]
[*] abcjsplugin - Create musical scores in your posts
[*] adultphotoflag - prevents nsfw photos from being displayed in public albums
[*] authchoose - only send identity assertions to sites of friends
[*] b2tbtn - provide button to go directly to top of page if you are scrolled a long way down
[*] bbmath - use complex math expressions in your posts
[*] bookmarker - replace #^ with bookmark link in posts
[*] buglink - provide a bug reporting icon in the lower-left corner of every page
[*] calc - a scientific calculator
[*] chess - cross domain identity aware interactive chess games
[*] chords - generate fingering charts and alternatives for every known guitar chord
[*] custom_home - set a custom page as the hub start page
[*] diaspora - Diaspora protocol emulator
[*] dirstats - show some interesting statistics generated by the directory server
[*] docs - alternate documentation pages
[*] donate - provides a project donation page
[*] dreamhost - provide a more reliable service on Dreamhost shared hosting
[*] dwpost - crosspost to Dreamwidth
[*] emojione - allow emojis as emoticons
[*] extcron - use an external cron service to run your hub's scheduled tasks
[*] firefox - provide a link to install the Firefox Sharing API
[*] flattrwidget - provides a "Flattr Us" button
[*] flip - create upside down text
[*] fortunate - displays random quote (fortune cookie). Requires setting up a fortune server.
[*] friendica - Friendica (DFRN) protocol. Under development.
[*] frphotos - import photo albums from Friendica
[*] gnusoc - GNU-Social (OStatus) protocol. Under development. 
[*] hexit - hexadecimal conversion tool
[*] hilite - allow language-specific highlighted code blocks in posts
[*] hubwall - send an admin email to all hub accounts
[*] ijpost - crosspost to Insanejournal
[*] irc - connect to IRC chatrooms
[*] jappixmini - XMPP chat
[*] js_upload - upload multiple photos to photo albums at once.
[*] keepout - prevents nearly all use of site when not logged in, more restrictive than 'block public' setting
[*] ldapauth - login via account on LDAP or Windows Active Directory domain 
[*] libertree - crosspost to Libertree
[*] likebanner - create a "like us on red#matrix" banner image
[*] ljpost - crosspost to LiveJournal
[*] logrot - logfile rotation utility
[*] mahjongg - Chinese puzzle game
[*] mailhost - when using multiple channel clones, select one to receive email notifications
[*] mailtest - interface for testing mail delivery system
[*] metatag - provide SEO friendly pages 
[*] mayan_places - set location field to a random city in the Mayan world
[*] morechoice - additional gender/sexual-preference choices for profiles (not safe for work)
[*] moremoods - Additional mood options
[*] morepokes - additional poke options (not safe for work)
[*] msgfooter - provide legal or other text on each outgoing post
[*] noembed - use noembed.com as an addition to $Projectname native oembed functionality (currently broken)
[*] nofed - prevent "federation" of channel posts, maintains all interaction on your site
[*] nsabait - add random terrorism related hashtags to your posts
[*] nsfw - Highly recommended plugin to collpase posts with inappropriate content
[*] openclipatar - choose a profile photo from hundreds of royalty free images
[*] openid - OpenID authentication and OpenID server. Your OpenID URL is [observer.baseurl]/id/[observer.webname]
[*] opensearch - allow your site to become a browser search provider
[*] openstreetmap - render locations and maps using OpenStreetMap
[*] pageheader - display text at the top of every page on the site
[*] phpmailer - alternate mail delivery system with more configurability
[*] piwik - open source website analytics
[*] planets - set location field to a random planet from Star Wars
[*] pong - classic pong game
[*] pubsubhubbub - PuSH protocol for optimised delivery to feed subscribers (required by GNU-Social protocol)
[*] pumpio - crosspost to Pump.io
[*] qrator - generate QR code images
[*] rainbowtag - display your tag and category clouds in colours
[*] randpost - post/reply bot based on and requires fortunate
[*] redfiles - import file storage from redmatrix
[*] redphotos - import photo albums from redmatrix
[*] redred - Crosspost to another Red Matrix or Hubzilla channel
[*] rendezvous - group location tracking
[*] rtof - Crosspost to Friendica
[*] sendzid - add 'zid' auth parmaters to all outbound links, not just in-network links
[*] skeleton - sample addon/plugin to demonstrate plugin development
[*] smiley_pack - extend the built-in smilie (emoticon) support
[*] smileybutton - provides a smiley selector on the post window
[*] startpage - set a personal preferred page to redirect after logging in.
[*] statistics - Diaspora statistics generator
[*] statusnet - GNU-social and StatusNet crosspost [zrl=[baseurl]/help/addons_gnusocial]Posting To Gnu Social[/zrl]
[*] std_embeds - allow unfiltered embeds for popular providers like youtube, vimeo and soundcloud
[*] superblock - Highly recommended - completely block an offensive channel from your stream
[*] testdrive - Turns your hub into a test drive site with accounts that expire after a trail period.
[*] tictac - 3D tic-tac-toe
[*] torch - flashlight app
[*] tour - feature tour for new members
[*] tripleaes - demo plugin for providing custom encryption algorithms
[*] twitter - crosspost to Twitter
[*] twitter_api - Twitter/Statusnet compatible API
[*] upload_limits - discover what server setting (there are a few) may be causing large photo uploads to fail
[*] visage - show visitors to your channel
[*] webmention - process webmentions
[*] wholikesme - provides a page to display what connections have 'liked' your posts the most
[*] webRTC - use an external server (mayfirst.org) to negotiate webRTC hookups
[*] wppost - crosspost to WordPress (or other wordpress XMLRPC service)
[*] xmpp - XMPP chat based on converse.js
[/list]

[h3]Addon Repositories[/h3]

We [b]strongly recommend[/b] that authors of addons publish/submit them to the project addon repository. This has several advantages. Project developers can easily fix security flaws and make changes to comply with recent changes in core code. Addons provided in third-party repositories are considered untrusted. If the project core code changes in an incompatible way, there may be no alternative but to physically remove or rename the addon files in order to get your site working again. Often only the plugin/addon author can help you regain control of your website, and project developers are unable to assist you; because by definition your site configuration has been modified in ways that we cannot easily test or verify. 

For these reasons we [b]strongly recommend[/b] that you do NOT install addons from third-party repositories.

We also recognise that some developers prefer working on their own and do not wish their code to be mingled with the project repository for a variety of reasons. These developers can ease troubleshooting and debugging by providing a README file in their respective code repository outlining the process for submitting patches and bug fixes. It is also recommended that these projects provide both a 'dev' (development) and 'master' (production) branch which tracks the current project branches of those names. This is because dev and master are often not compatible from the viewpoint of library interfaces. It is also highly recommended that your repository versions are tagged and moved forward within 24 hours of project releases. This is a major inconvenience for everybdy involved, and can present downtime for production sites while this process is being carried out; which is one more reason why we [b]strongly recommend[/b] that addons be submitted to the project addon repository and that you do NOT install such third-party addons. 


[url=https://github.com/redmatrix/hubzilla-addons]https://github.com/redmatrix/hubzilla-addons[/url] Main project addon repository

[url=https://github.com/23n/red-addons]https://github.com/23n/red-addons[/url] Oliver's repository (mayan_places and flip)



#include doc/macros/main_footer.bb;


