package org.gangulwar.newsapp;

import java.util.ArrayList;

public class APIRequest {

    public static ArrayList<TopStroiesModal> getTopStroies;

    {

    }

    public static ArrayList<TopStroiesModal> getLatestNews;

    {

    }

    public static ArrayList<TopStroiesModal> getBusinessNews;

    {

    }


    public static ArrayList<TopStroiesModal> getSportsNews() {

        ArrayList<TopStroiesModal> arrayList = new ArrayList<>();

        arrayList.add(new TopStroiesModal(
                "The Times of India",
                "TIMESOFINDIA.COM",
                "Chess World Cup: Praggnanandhaa shocks Caruana, meets Carlsen in final",
                "In a remarkable display of skill and determination, Indian Grandmaster R Praggnanandhaa secured a stunning victory over World No. 3 Fabiano Caruana...",
                "https://timesofindia.indiatimes.com/sports/chess/chess-world-cup-praggnanandhaa-shocks-caruana-meets-carlsen-in-final/articleshow/102916116.cms",
                "https://static.toiimg.com/thumb/msid-102916104,width-1070,height-580,imgsize-71400,resizemode-75,overlay-toi_sw,pt-32,y_pad-40/photo.jpg",
                "2023-08-21T16:05:00Z",
                "Messi fires again, Inter Miami win Leagues Cup"
        ));

        arrayList.add(new TopStroiesModal(
                "NDTV News",
                "NDTV Sports Desk",
                "Watch: UFC Fighter Sean O'Malley's Brutal Knock Out Of Aljamain Sterling Called 'Most Beautiful' Sho..",
                "The UFC (Ultimate Fighting Championship) is often referred to as the most brutal martial arts competition in the world...",
                "https://sports.ndtv.com/othersports/ufc-fighter-sean-omalleys-brutal-knock-out-of-aljamain-sterling-called-the-most-beautiful-shot-gets-12-million-plus-views-watch-4316914",
                "https://c.ndtvimg.com/2023-08/gnb4b2ao_sean-omalley_625x300_21_August_23.jpg",
                "2023-08-21T15:33:00Z",
                "The UFC (Ultimate Fighting Championship) is often referred to as the most brutal martial arts competition in the world. In the octagonal cage, anything can happen..."
        ));

        arrayList.add(new TopStroiesModal(
                "YouTube",
                null,
                "Curling Brilliance: Messi's Epic Long-Distance Goal in Leagues Cup Final",
                "Inter Miami CF's superstar forward helped deliver a 2023 Leagues Cup title over Nashville SC on Saturday evening at GEODIS Park...",
                "https://www.youtube.com/watch?v=IvWUBry9bw8",
                "https://i.ytimg.com/vi/IvWUBry9bw8/maxresdefault.jpg",
                "2023-08-21T15:10:36Z",
                null
        ));

        arrayList.add(new TopStroiesModal(
                "The Times of India",
                "TIMESOFINDIA.COM",
                "Watch - 'Hopefully Sharma and Kohli can roll some arm over': Rohit Sharma's hilarious reply",
                "Cricket News: Team India skipper Rohit Sharma faced a barrage of questions when he along with chief selector Ajit Agarkar addressed the media after the Asia Cup squ...",
                "https://timesofindia.indiatimes.com/sports/cricket/asia-cup/watch-hopefully-sharma-and-kohli-can-roll-some-arm-over-rohit-sharmas-hilarious-reply/articleshow/102915344.cms",
                "https://static.toiimg.com/thumb/msid-102915360,width-1070,height-580,imgsize-54722,resizemode-75,overlay-toi_sw,pt-32,y_pad-40/photo.jpg",
                "2023-08-21T15:02:00Z",
                "Messi fires again, Inter Miami win Leagues Cup"
        ));

        arrayList.add(new TopStroiesModal(
                "ESPN India",
                "Rob Dawson",
                "Mason Greenwood to leave Man Utd after club investigation - ESPN",
                "Mason Greenwood will leave Manchester United after the club concluded their investigation into the circumstances around his arrest in January 2022...",
                "https://www.espn.in/football/story/_/id/38232851/mason-greenwood-leave-man-united-club-investigation",
                "https://a.espncdn.com/combiner/i?img=%2Fphoto%2F2022%2F1015%2Fr1075973_1296x729_16%2D9.jpg",
                "2023-08-21T14:00:00Z",
                "Mason Greenwood will leave Manchester United after the club concluded their investigation into the circumstances around his arrest in January 2022..."
        ));

        arrayList.add(new TopStroiesModal(
                "International Cricket Council",
                "ICC",
                "Injury forces change in England's squad for T20I series against New Zealand",
                "Injury to uncapped pacer John Turner has forced England to make a change to their T20I squad for the four-game series...",
                "https://www.icc-cricket.com/news/3645414",
                "https://resources.pulse.icc-cricket.com/ICC/photo/2023/08/21/aa96a9c6-1ce4-41d2-a7d4-f0e8c24e548d/GettyImages-1409324291.jpg",
                "2023-08-21T13:56:05Z",
                "Injury to uncapped pacer John Turner has forced England to make a change to their T20I squad for the four-game series..."
        ));

        arrayList.add(new TopStroiesModal(
                "Sportskeeda",
                "Matthew Guyett",
                "“Can do it without KDB”, “Always been better” – Manchester City fans believe 23-year-old should play instead of Haaland after win over Newcastle",
                "Several Manchester City fans reckon Julian Alvarez should replace Erling Haaland in Pep Guardiola's side after his matchwinning performance against Newcastle United...",
                "https://www.sportskeeda.com/football/news-can-without-kdb-always-better-manchester-city-fans-believe-23-year-old-play-instead-haaland-win-newcastle",
                "https://staticg.sportskeeda.com/editor/2023/08/6c4b7-16924942561951-1920.jpg",
                "2023-08-21T13:38:00Z",
                "Several Manchester City fans reckon Julian Alvarez should replace Erling Haaland in Pep Guardiola's side after his matchwinning performance against Newcastle"
        ));

        return arrayList;
    }

    public static ArrayList<TopStroiesModal> getScienceNews() {
        ArrayList<TopStroiesModal> arrayList = new ArrayList<>();
        arrayList.add(new TopStroiesModal(
                "YouTube",
                null,
                "NOVA The Planets: Inner Worlds - WLRN Public Radio and Television",
                "The rocky planets  all have similar origins, but only one supports life.The four planets closest to the sun, called the rocky planets, were born from the sam...",
                "https://www.youtube.com/watch?v=jOC9eoE9a1M",
                "https://i.ytimg.com/vi/jOC9eoE9a1M/maxresdefault.jpg",
                "2023-08-21T18:00:36Z",
                null
        ));

        arrayList.add(new TopStroiesModal(
                "YouTube",
                null,
                "Behind the Spacecraft: Psyche – Journey to a Metal World (Teaser Trailer) - NASA Jet Propulsion Laboratory",
                "Meet some of the engineers contributing to NASA’s Psyche mission, which will be the first to explore a metal-rich asteroid, also named Psyche. This trailer p...",
                "https://www.youtube.com/watch?v=kEErgualpew",
                "https://i.ytimg.com/vi/kEErgualpew/maxresdefault.jpg",
                "2023-08-21T16:14:36Z",
                null
        ));

        arrayList.add(new TopStroiesModal(
                "Ncsu.edu",
                "Tracey Peake",
                "Did Sabertooth Tigers Purr or Roar? | NC State News - NC State News",
                "The sound a sabertooth made could depend on the shape of a few small bones.",
                "https://news.ncsu.edu/2023/08/did-sabertooth-tigers-purr-or-roar/",
                "https://news.ncsu.edu/wp-content/uploads/2023/08/Hartstone-Rose-Smilodon-1500-scaled.jpg",
                "2023-08-21T15:53:51Z",
                "When a sabertooth tiger called out, what noise did it make a mighty roar or a throaty purr? A new study from North Carolina State University examined the data behind the arguments for each vocalizati… [+6652 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "Daily Mail",
                "Sam Tonkin",
                "How the sun will look when it DIES: NASA image gives a glimpse at what's in store for our home star (but don't - Daily Mail",
                "The photo was taken by NASA's James Webb Space Telescope (JWST) and reveals new features of the spectacular doughnut-like structure of glowing gas known as the Ring Nebula.",
                "https://www.dailymail.co.uk/sciencetech/article-12429133/How-sun-look-DIES-NASA-image-gives-glimpse-whats-store-home-star-dont-worry-weve-got-5-billion-years-left.html",
                "https://i.dailymail.co.uk/1s/2023/08/21/15/74560131-0-image-a-72_1692628843035.jpg",
                "2023-08-21T15:38:09Z",
                "This awe-inspiring image captures the end stages of a distant star's life and offers a sneak peak of what will happen to our own sun in some 5 billion years.\r\nIt was taken by NASA's James Webb Space … [+7016 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "Medical Xpress",
                "Science X",
                "Cracking the code that relates brain and behavior in a simple animal - Medical Xpress",
                "To understand the full relationship between brain activity and behavior, scientists have needed a way to map this relationship for all of the neurons across a whole brain—a so far insurmountable challenge...",
                "https://medicalxpress.com/news/2023-08-code-brain-behavior-simple-animal.html",
                "https://scx2.b-cdn.net/gfx/news/hires/2016/56e9b84c79118.jpg",
                "2023-08-21T15:33:21Z",
                "To understand the full relationship between brain activity and behavior, scientists have needed a way to map this relationship for all of the neurons across a whole brain—a so far insurmountable chall… [+8025 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "YouTube",
                null,
                "NASA's SpaceX Crew-7 Mission to the Space Station (Official Trailer) - NASA",
                "An international crew is preparing to launch to the International Space Station aboard NASA’s SpaceX Crew-7 mission.NASA astronaut Jasmin Moghbeli, ESA (Euro...",
                "https://www.youtube.com/watch?v=LapcNp5La48",
                "https://i.ytimg.com/vi/LapcNp5La48/maxresdefault.jpg",
                "2023-08-21T15:30:29Z",
                null
        ));

        arrayList.add(new TopStroiesModal(
                "NDTV News",
                null,
                "Are Aliens Real? Astronomers May Receive Signal Tomorrow - NDTV",
                "The message comprised 13 drawings depicting the history of life on Earth, what humans look like and other information.",
                "https://www.ndtv.com/world-news/are-aliens-real-astronomers-may-receive-signal-tomorrow-4316905",
                "https://c.ndtvimg.com/2023-08/tmsrt438_alien-unsplash_625x300_13_August_23.jpg",
                "2023-08-21T15:11:24Z",
                "August 22 is a symbolic day for Japan as it celebrates Tanabata\r\nAstronomers are anxiously waiting for a reply to radio signals beamed into the cosmos 40 years ago which will prove the existence of e… [+2176 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "Essentially Sports",
                null,
                "\"Were Some of the Healthiest People\": Exercise Scientist Explains Why Vegans Today Are Not as Healthy as Vegans in the 90s - EssentiallySports - EssentiallySports",
                "Exercise Scientist spills beans on the changes that happened to vegan food over years in his latest YouTube video.",
                "https://www.essentiallysports.com/bodybuilding-news-were-some-of-the-healthiest-people-exercise-scientist-explains-why-vegans-today-are-not-as-healthy-as-vegans-in-the/",
                "https://image-cdn.essentiallysports.com/wp-content/uploads/355603107_1426824984823022_7681705007513906089_n.jpg",
                "2023-08-21T13:45:00Z",
                "The fitness world can never overcome the online consumption of fitness-related content like various fad diets and exercise routines. As the awareness to eat healthily is increasing across different s… [+3121 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "YouTube",
                null,
                "Chandrayaan-3: What lessons India learnt from mishaps of Chandrayaan-2 mission? - The Economic Times",
                "Chandrayaan-3 is set to land on the moon on August 23, 2023 (Wednesday), around 18:04 IST, ISRO had announced officially on Sunday. The spacecraft is now jus...",
                "https://www.youtube.com/watch?v=fvfb2VGheTM",
                "https://i.ytimg.com/vi/fvfb2VGheTM/maxresdefault.jpg",
                "2023-08-21T13:32:02Z",
                null
        ));

        arrayList.add(new TopStroiesModal(
                "Hindustan Times",
                "HT Tech",
                "190-foot Asteroid 2023 PM to make close approach to Earth, says NASA - HT Tech",
                "According to NASA, an asteroid called 2023 PM is set to make a close approach to Earth tomorrow. Check the asteroid’s speed, size, distance, and more.",
                "https://tech.hindustantimes.com/photos/190foot-asteroid-2023-pm-to-make-close-approach-to-earth-says-nasa-71692605823563.html",
                "https://images.hindustantimes.com/tech/img/2023/08/21/1600x900/g357f4_1692605903382_1692605903600.png",
                "2023-08-21T08:21:57Z",
                "Top SectionsExplore Tech Copyright © HT Media Limited All rights reserved."
        ));
        return arrayList;
    }

    public static ArrayList<TopStroiesModal> getTechnologyNews() {
        ArrayList<TopStroiesModal> arrayList = new ArrayList<>();

        arrayList.add(new TopStroiesModal(
                "Pocket-lint",
                "Pocket-lint",
                "These key OnePlus 12 upgrades scream premium handset",
                null,
                "https://www.pocket-lint.com/these-key-oneplus-12-upgrades-scream-premium-handset/",
                null,
                "2023-08-21T17:03:00Z",
                null
        ));

        arrayList.add(new TopStroiesModal(
                "Business Standard",
                "Press Trust of India",
                "HonorTech to relaunch Honor brand of phones in Sept, to invest Rs 1,000 cr",
                "HonorTech will relaunch the Honor brand of smartphones in the country in September with plans to initially invest Rs 1,000 crore in the business, a senior company official said.",
                "https://www.business-standard.com/technology/tech-news/honortech-to-relaunch-honor-brand-of-phones-in-sept-to-invest-rs-1-000-cr-123082100298_1.html",
                "https://bsmedia.business-standard.com/_media/bs/img/article/2022-09/30/full/1664502133-6033.jpg",
                "2023-08-21T16:58:12Z",
                "For the relaunch, Honor... [+2226 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "The Siasat Daily",
                "Indo-Asian News Service",
                "Samsung unveils world’s first gaming title featuring HDR10+ GAMING standard",
                "Samsung Electronics on Monday announced the launch of the world’s first gaming title featuring the High Dynamic Range (HDR) 10+ GAMING",
                "https://www.siasat.com/samsung-unveils-worlds-first-gaming-title-featuring-hdr10-gaming-standard-2673521/",
                "https://cdn.siasat.com/wp-content/uploads/2023/08/hdr.jpg",
                "2023-08-21T16:53:00Z",
                "Seoul: Samsung Electronics on Monday announced the launch of the worlds first gaming title featuring the High Dynamic Range (HDR) 10+ GAMING standard created by HDR10+ Technologies LLC. The new titl… [+1853 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "The Siasat Daily",
                "Indo-Asian News Service",
                "Apple shipped 1 bn units less than Samsung in last decade, now leads the race",
                "New Delhi: Apple shipped over 2.1 billion iPhones in the past decade, almost one billion less than its South Korean competitor Samsung, a new report showed on Monday. However, Samsung’s annual shipments have dropped by 18 per cent in 10 years while Apple’s sh…",
                "https://www.siasat.com/apple-shipped-1-bn-units-less-than-samsung-in-last-decade-now-leads-the-race-2673498/",
                "https://cdn.siasat.com/wp-content/uploads/2022/01/iPhone-13-1.jpg",
                "2023-08-21T16:20:00Z",
                "New Delhi: Apple shipped over 2.1 billion iPhones in the past decade, almost one billion less than its South Korean competitor Samsung, a new report showed on Monday. However, Samsungs annual shipme… [+2065 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "Abplive.com",
                "ABP News Bureau",
                "OnePlus Nord CE 3 Lite, Tecno Camon 20 Pro, Samsung Galaxy M34: Top 5G Smartphones Under Rs 20,000",
                "Some of the best smartphones in this price bracket are from the likes of OnePlus, Samsung, Xiaomi and Tecno among others, which are very capable and offer good cameras and battery life too.",
                "https://news.abplive.com/technology/gadgets/best-5g-smartphones-under-rs-20000-india-1624512",
                "https://feeds.abplive.com/onecms/images/uploaded-images/2023/08/21/edc663fd64a05539506eb9581c719a101692634632519295_original.png?impolicy=abp_cdn&imwidth=1200&imheight=628",
                "2023-08-21T16:19:12Z",
                null
        ));

        arrayList.add(new TopStroiesModal(
                "Jagran.com",
                "Ashish Singh",
                "Apple Maps Will Show You Real-Time EV Charging Availability With Upcoming iOS 17; Here's How",
                "Apple iOS 17 may soon allow users to access real-time charging availability information and choose a preferred charging network for their electric vehicle EV",
                "https://english.jagran.com/us/tech/apple-maps-will-show-you-realtime-ev-charging-availability-with-upcoming-ios-17-tesla-ev-charger-ev-chargers-10095145",
                "https://imgeng.jagran.com/images/2023/aug/IOS 17 (2)1692612789902.jpg",
                "2023-08-21T15:37:00Z",
                "The upcoming iOS 17 software update is expected to include a slew of new features such as NameDrop, SharePlay, and Journaling Application, will reportedly get a new feature that will allow users to g… [+1907 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "9to5google.com",
                "Abner Li",
                "Gmail for Android and iOS can now translate emails [U]",
                "Google is finally adding a native translate capability to Gmail for Android and iOS after long offering it on the web client...",
                "https://9to5google.com/2023/08/21/gmail-translate-android-ios/",
                "https://i0.wp.com/9to5google.com/wp-content/uploads/sites/4/2023/03/gmail-logo-circle-4.jpg?resize=1200%2C628&quality=82&strip=all&ssl=1",
                "2023-08-21T15:20:00Z",
                "Google is finally adding a native translate capability to Gmail for Android and iOS after long supporting it on the web client.\r\nUpdate 8/21: Gmail’s translate feature is rolling out via a server-sid… [+1461 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "Sportskeeda",
                "Suyash Sahay",
                "Will GTA 6 be announced at Gamescom 2023 showcase? All you need to know",
                "Gamescom 2023 is just around the corner, and one of the biggest questions on gamers' minds is whether Grand Theft Auto (GTA) 6 will be announced at the event.",
                "https://www.sportskeeda.com/gta/will-gta-6-announced-gamescom-2023-showcase-all-need-know",
                "https://staticg.sportskeeda.com/editor/2023/08/35f09-16926262400539-1920.jpg",
                "2023-08-21T15:02:00Z",
                "Gamescom 2023 is just around the corner, and one of the biggest questions on gamers' minds is whether Grand Theft Auto (GTA) 6 will be announced at the event. Gamescom is among the biggest video game… [+2793 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "The Times of India",
                "Shivangi Jamwal",
                "Gaming laptops under 90000: Top picks",
                "Discover the ultimate gaming experience without breaking the budget. Explore our curated list of the best gaming laptops under 90000 that seamlessly combine performance and affordability. From powerful processors to stunning screens...",
                "https://timesofindia.indiatimes.com/most-searched-products/electronics/laptops/gaming-laptops-under-90000-top-picks/articleshow/102914816.cms",
                "https://static.toiimg.com/thumb/msid-102914836,width-1070,height-580,imgsize-49870,resizemode-75,overlay-toi_sw,pt-32,y_pad-40/photo.jpg",
                "2023-08-21T14:49:00Z",
                "Dive into the world of gaming excellence with this curated selection of best gaming laptops under 90000. Discover powerful performance, stunning graphics, and immersive experiences, all without stret… [+161 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "IGN",
                "Anthony Wood",
                "Starfield Leaked Start Screen Discourse Addressed by Bethesda’s Head of Publishing",
                "Bethesda’s Pete Hines has addressed criticisms surrounding Starfield’s leaked start screen, while also revealing that the landing menu was one of the first things that the design team settled on.",
                "https://www.ign.com/articles/starfield-leaked-start-screen-discourse-addressed-by-bethesdas-head-of-publishing",
                "https://assets-prd.ignimgs.com/2023/06/14/starfield-1686783138331.jpg?width=1280",
                "2023-08-21T14:00:34Z",
                "Bethesda head of publishing Pete Hines has spoken out in response to remarks made by ex-Blizzard developer Mark Kern, who had previously leaked an image of Starfields start screen and criticized its … [+3779 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "Pocket-lint",
                "Pocket-lint",
                "The Samsung Galaxy S25 Ultra could come with a whopping 400-megapixel camera",
                null,
                "https://www.pocket-lint.com/the-samsung-galaxy-s25-ultra-could-come-with-a-whopping-400-megapixel-camera/",
                null,
                "2023-08-21T13:51:00Z",
                null
        ));

        arrayList.add(new TopStroiesModal(
                "India Today",
                "Aman Rashid",
                "iPhone 14 Plus available for as low as Rs 72,999 ahead of iPhone 15 launch, 4 reasons to buy",
                "If you have been eyeing the iPhone 14 Plus all this while, now would be the right time to get one. Check out the deal.",
                "https://www.indiatoday.in/technology/news/story/iphone-14-plus-available-for-as-low-as-rs-72999-ahead-of-iphone-15-launch-4-reasons-to-buy-2424468-2023-08-21",
                "https://akm-img-a-in.tosshub.com/indiatoday/images/media_bank/202308/iphone-14-plus-214341-16x9.png?VersionId=k2hBKbLaSugtqBf4_YZ7kwUTmf9PrU92",
                "2023-08-21T13:50:49Z",
                "The iPhone 14 Plus is currently retailing on Flipkart with a solid discount, ahead of the iPhone 15 Plus launch, which is expected next month. The iPhone 14 Plus is currently listed at a best-buy pri… [+3184 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "The Times of India",
                "TIMESOFINDIA.COM",
                "Chrome vs Safari vs Edge: Which browser consumes more RAM and why",
                "Google Chrome, Apple Safari, and Microsoft Edge are popular web browsers that have different RAM consumption rates. Chrome is a memory hog that runs e",
                "https://timesofindia.indiatimes.com/gadgets-news/chrome-vs-safari-vs-edge-which-browser-consumes-more-ram-and-why/articleshow/102913833.cms",
                "https://static.toiimg.com/thumb/msid-102913833,width-1070,height-580,imgsize-318322,resizemode-75,overlay-toi_sw,pt-32,y_pad-40/photo.jpg",
                "2023-08-21T13:46:00Z",
                "Common laptop problems and their fixes"
        ));

        arrayList.add(new TopStroiesModal(
                "The Quint",
                "Aishwarya Varma",
                "Fact-Check | This Video of a Qantas Plane Flying Closely Above Grounded Emirates Plane Is Not of a Real Incident",
                "Fact-Check | A video of a near miss between two planes is going viral on social media, but it's actually just a clip from a video game. There are no recent news reports on such an incident happening anywhere in the world.",
                "https://www.thequint.com/news/webqoof/viral-video-of-emirates-qantas-airplane-near-miss-is-not-real-fact-check",
                "https://images.thequint.com/thequint%2F2023-08%2Fd988ed97-eedc-45d1-b946-697f4965ec95%2FAishwarya_WQ.jpg?rect=0%2C26%2C1920%2C1008",
                "2023-08-21T13:43:54Z",
                "The Quint received a query for this video's verification on its WhatsApp tipline. (Archives of more claims can be seen here, here, here and here.) But...?: The video was made using a video game sim… [+22 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "News18",
                "S Aadeetya",
                "Apple iPhone 15 Pro Max Could Be Rebranded As Ultra This Year After All",
                "The iPhone 15 Pro series could have two models once again but moving to Ultra opens up new avenues for Apple.",
                "https://www.news18.com/tech/apple-iphone-15-pro-max-could-be-rebranded-as-ultra-this-year-after-all-8544929.html",
                "https://images.news18.com/ibnlive/uploads/2023/08/iphone-15-pro-169148849716x9.jpg",
                "2023-08-21T12:43:00Z",
                "The iPhone 13 and 13 Pro lineup has been confirmed by Apple, while the 2023 devices are still months away, fresh reports from notable Apple analyst Ming-Chi Kuo have revealed a bit more about what t… [+3191 chars]"
        ));

        return arrayList;

    }

    public static ArrayList<TopStroiesModal> getEntertainmentNews() {
        ArrayList<TopStroiesModal> arrayList = new ArrayList<>();

        arrayList.add(new TopStroiesModal(
                "PINKVILLA",
                "Khushboo Ratda",
                "Pawan Kalyan's Ustaad Bhagat Singh NOT shelved; here's a big update - PINKVILLA",
                "Pawan Kalyan And Harish Shankar's Much-awaited Film, Ustaad Bhagat Singh Is Not Shelved And Is Right On Track.",
                "https://www.pinkvilla.com/entertainment/south/pawan-kalyan-ustaad-bhagat-singh-not-shelved-heres-a-big-update-1237323",
                "https://www.pinkvilla.com/images/2023-08/1966416442_pawan-kalyan-harish-shankar-ustaad-bhagat-singh-1-1.jpg",
                "2023-08-21T16:46:19Z",
                "Pawan Kalyan and Harish Shankar's much-awaited film, Ustaad Bhagat Singh has been the talk of the town since its inception. They together delivered one of the all-time blockbusters- Gabbar Singh. Whi… [+1658 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "The Indian Express",
                "The Indian Express",
                "Gadar 2’s record-breaking box office performance ‘has blown everyone’s brains away’: Karan Johar applauds Sunny Deol’s film - The Indian Express",
                null,
                "https://indianexpress.com/article/entertainment/bollywood/karan-johar-applauds-gadar-2-record-breaking-box-office-performance-8902759/",
                null,
                "2023-08-21T16:12:05Z",
                null
        ));

        arrayList.add(new TopStroiesModal(
                "The Quint",
                "Quint Entertainment",
                "Rajinikanth's 'Jailer' Becomes 2nd Tamil Film to Cross ₹ 500 Crore at Box Office - The Quint",
                "Jailer crossed the 500-crore mark at the global box office, becoming the second Tamil film to do so in the last ten years. The film is slowly becoming one of the highest-grossing Indian films of all time.",
                "https://www.thequint.com/entertainment/south-cinema/jailer-box-office-rajinikanth-film-second-tamil-film-to-cross-500-crore-mark",
                "https://images.thequint.com/thequint%2F2023-08%2Fc9e4f9eb-b325-4c37-8e01-eecf707bc6e7%2FScreenshot__165_.png?rect=0%2C0%2C1456%2C764",
                "2023-08-21T16:04:23Z",
                "As per a report by DNA, on Sunday, the films eleventh day of release, Jailer earned Rs 19.20 crore in India Rs 14 crore in Tamil, Rs 4 crore in Telugu, Rs 70 lakhs in Hindi, and Rs 50 lakhs in Kannad… [+347 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "Gulte",
                "Satya B",
                "Gandheevadhari Arjuna Trailer: Stylish And Action Packed - Gulte",
                "Varun Tej’s upcoming film is a slick action thriller titled Gandheevadhari Arjuna. The film made on a huge scale is directed by Praveen Sattaru. The film will be releasing in theatres on August 25th and it got solid buzz with rece…",
                "https://www.gulte.com/movienews/255551/gandheevadhari-arjuna-trailer-stylish-and-action-packed",
                "https://cdn.gulte.com/wp-content/uploads/2023/08/Gandheevadhari-Arjuna.jpg",
                "2023-08-21T15:24:26Z",
                "Varun Tejs upcoming film is a slick action thriller titled Gandheevadhari Arjuna. The film made on a huge scale is directed by Praveen Sattaru. The film will be releasing in theatres on August 25th a… [+736 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "PINKVILLA",
                "Roopa Radhakrishnan",
                "Prabhas reacts to Anushka Shetty's Miss Shetty Mr Polishetty trailer; here's what he has to say - PINKVILLA",
                "Prabhas Shared Via His Instagram Story That He Could Not Stop Laughing After Watching The Trailer For Anushka Shetty’s Miss Shetty Mr Polishetty.",
                "https://www.pinkvilla.com/entertainment/south/prabhas-reacts-to-anushka-shettys-miss-shetty-mr-polishetty-trailer-heres-what-he-has-to-say-1237318",
                "https://www.pinkvilla.com/images/2023-08/27264719_prabhas-anushka-miss-shetty-trailer-1280-min.jpg",
                "2023-08-21T15:20:54Z",
                "The trailer for Miss Shetty Mr Polishetty, starring Anushka Shetty and Naveen Polishetty, has just been released. Netizens have given the trailer a thumbs up. Soon after the trailer came out, one of … [+2220 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "Hindustan Times",
                "HT Entertainment Desk",
                "Namita Thapar reacts after people spotted non veg in her barbeque post - Hindustan Times",
                "Namita Thapar is best known as the judge of Shark Tank India. She is Executive Director of Emcure Pharmaceuticals.",
                "https://www.hindustantimes.com/entertainment/tv/namita-thapar-on-non-veg-being-cooked-in-barbeque-post-shark-tank-india-101692622623672.html",
                "https://www.hindustantimes.com/ht-img/img/2023/08/21/1600x900/namita_1692629540877_1692629541237.jpg",
                "2023-08-21T14:55:01Z",
                "Shark Tank India judge Namita Thapar offered clarification via a post on LinkedIn after many people criticised her for eating meat. Namita had previously claimed herself to be a vegetarian on Shark T… [+2177 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "Mid-day",
                null,
                "Entertainment top stories: Adil Khan reacts to Rakhi Sawant's allegations against him; Pankaj Tripathi's father passes away - mid-day.com",
                "Entertainment Top Stories: End your day with the most happening highlights. It's time to relax and take a look at the latest news and events",
                "https://www.mid-day.com/entertainment/bollywood-news/photo/entertainment-top-stories-adil-hits-back-at-rakhi-sawants-allegations-pankaj-tripathis-father-passes-away-96963",
                "https://images.mid-day.com/images/images/2023/aug/enttopstoriespankajrakhi_d.jpg",
                "2023-08-21T14:53:00Z",
                "Rakhi Sawant, Adil Khan, Pankaj Tripathi. Pic/Google\r\nAdil Khan Durrani, Rakhi Sawant's ex-husband, who was in judicial custody following multiple accusations from the actress, has revealed his side … [+445 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "PINKVILLA",
                "Arpita Sarkar",
                "PICS: Sonam Kapoor held special puja to celebrate son Vayu's 1st birthday with family; pens beautiful message - PINKVILLA",
                "Sonam Kapoor Shared A Bunch Of Pictures From Her Son Vayu's Birthday Celebration As He Turned 1 On August 20. The Actress Held A Special Puja For Her Son And Also Penned A Beautiful Message.",
                "https://www.pinkvilla.com/entertainment/news/pics-sonam-kapoor-held-special-puja-to-celebrate-son-vayus-1st-birthday-with-family-pens-beautiful-message-1237311",
                "https://www.pinkvilla.com/images/2023-08/474135355_sonam-kapoor-l-1.jpg",
                "2023-08-21T14:52:56Z",
                "Vayu Kapoor Ahuja, the son of Bollywood actress Sonam Kapoor and her businessman husband Anand Ahuja turned 1 on August 20. The couple welcomed their baby boy on August 20 last year. The actress has … [+2216 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "Hindustan Times",
                "HT Entertainment Desk",
                "Bigg Boss 17 to go on air soon: Here's what we know so far - Hindustan Times",
                "Reports suggest Bigg Boss 17 is all set to be back on TV with Salman Khan as the host and the theme is likely to be couples versus singles this time.",
                "https://www.hindustantimes.com/entertainment/tv/bigg-boss-17-to-go-on-air-soon-couples-vs-singles-theme-possible-participants-here-is-what-we-know-101692618045891.html",
                "https://www.hindustantimes.com/ht-img/img/2023/08/21/1600x900/alice_kanwar_1692620666570_1692620672599.JPG",
                "2023-08-21T12:53:00Z",
                "Just a week after the digital version of the reality show came to an end, rumours are already rife about participants for the upcoming seventeenth season of Bigg Boss. Alice Kaushik and Samarth Jurel… [+2125 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "PINKVILLA",
                "Himesh Mankad",
                "EXCLUSIVE: Salman Khan locks his schedule for Vishnuvardhan’s next, Tiger vs Pathaan, & Sooraj Barjatya's film - PINKVILLA",
                "Salman Khan Gears Up For Back To Back Films With Dharma, YRF And Rajshri. Allots 125 Days Each To Vishnuvardhan's Next, Tiger Vs Pathaan And Prem Ki Shaadi. Details",
                "https://www.pinkvilla.com/entertainment/exclusives/exclusive-salman-khan-locks-his-shooting-schedule-for-vishnuvardhans-next-tiger-vs-pathaan-sooraj-barjatyas-next-1237281",
                "https://www.pinkvilla.com/images/2023-08/1419515262_salman-khan-main-1.jpg",
                "2023-08-21T12:51:10Z",
                "Over the last few months, Salman Khan kept himself busy reading scripts from directors across the country. While Kisi Ka Bhai Kisi Ki Jaan and Tiger 3 were commitments made much before the pandemic, … [+3467 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "The Indian Express",
                "Entertainment Desk",
                "Indian Matchmaking contestant Pradhyuman Maloo, who rejected 150 women, faces legal trouble as wife Ashima Chauhaan files FIR - The Indian Express",
                "Pradhyuman Maloo appeared on the first season of Indian Matchmaking. He also briefly appeared in season two.",
                "https://indianexpress.com/article/entertainment/web-series/indian-matchmaking-contestant-pradhyuman-maloo-who-rejected-150-women-faces-legal-trouble-as-wife-ashima-chauhaan-files-fir-8902575/",
                "https://images.indianexpress.com/2023/08/MALOO.jpg",
                "2023-08-21T12:47:24Z",
                "Pradhyuman Maloo, who appeared on the Netflix show Indian Matchmaking, got married to Ashima Chauhaan in 2020. Pradhyuman, a 33-year-old jewellery designer from Mumbai, had high standards for a partn… [+1225 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "NDTV News",
                null,
                "Akshay Kumar's Ikke Pe Ikka Co-Star Shanthi Priya Claims He Commented On Her Knees: \"Went Into Depression\" - NDTV Movies",
                "Shanthi Priya went on to add that Akshay Kumar never apologised for what he said on the sets of the film",
                "https://www.ndtv.com/entertainment/shanthi-priya-on-akshay-kumar-commenting-on-her-dark-knees-4316151",
                "https://c.ndtvimg.com/2023-08/bmba8r98_alia-_625x300_21_August_23.jpg",
                "2023-08-21T12:43:23Z",
                "Actress Shanthi Priya recently spoke about her equation with her first co-star Akshay Kumar. She made her Bollywood debut with Saugandh, wh… [+2065 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "Livemint",
                "Livemint",
                "OMG2 star Pankaj Tripathi's father passes away at 99 | Mint - Mint",
                "Bollywood star Akshay Kumar expressed his sadness at the demise of Tripathi’s father",
                "https://www.livemint.com/industry/media/omg2-star-pankaj-tripathis-father-passes-away-at-99-11692619443766.html",
                "https://www.livemint.com/lm-img/img/2023/08/21/600x338/pankajtripathi_1692620288710_1692620288880.jpg",
                "2023-08-21T12:37:37Z",
                "Bollywood actor Pankaj Tripathi's father Banaras Tiwari passed away at the age of 99 on Monday.\r\n Tripathi and his family confirmed the news.\r\n It's with a heavy heart to confirm that Pankaj Tripathi… [+1962 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "Hindustan Times",
                "HT Entertainment Desk",
                "Karisma Kapoor, Kajol drive Monday blues away with stunning pics - Hindustan Times",
                "Kajol and Karishma Kapoor kickstarted the week by treating fans to their stunning photos. Here's what the internet thinks about them. | Bollywood",
                "https://www.hindustantimes.com/entertainment/bollywood/karisma-kapoor-kajol-share-stunning-pics-fans-react-101692614439840.html",
                "https://www.hindustantimes.com/ht-img/img/2023/08/21/1600x900/kajol_1692618067998_1692618068328.jpg",
                "2023-08-21T12:02:34Z",
                "Kajol and Karisma Kapoor are maong the most popular actors of the '90s. The two are quite famous on the internet as well and their latest posts are proof. On Monday, Kajol took to her Instagram handl… [+2094 chars]"
        ));

        arrayList.add(new TopStroiesModal(
                "The Times of India",
                "Karen Pereira",
                "Ayushmann Khurrana on 'Dream Girl 2': Excited to work with Annu Kapoor again - Times of India",
                "Ahead of the film's release, Ayushmann Khurrana opened up about his upcoming film 'Dream Girl 2', revealing he is excited to work with his co-star Annu Kapoor again after a decade. Find out more!",
                "https://timesofindia.indiatimes.com/entertainment/hindi/bollywood/news/ayushmann-khurrana-on-dream-girl-2-excited-to-work-with-annu-kapoor-again/articleshow/93510374.cms",
                "https://static.toiimg.com/photo/msid-93510379/93510379.jpg?resizemode=4",
                "2023-08-21T11:57:18Z",
                "Ahead of the film's release, Ayushmann Khurrana opened up about his upcoming film 'Dream Girl 2', revealing he is excited to work with his co-star Annu Kapoor again after a decade. Find out more!\n\nAy… [+2080 chars]"
        ));

        return arrayList;
    }

    public static ArrayList<TopStroiesModal> getBusinessNews() {

        ArrayList<TopStroiesModal> arrayList = new ArrayList<>();
        arrayList.add(new TopStroiesModal(
                "Livemint",
                "Livemint",
                "Paytm eyes India-scale AI system; fintech investing to build AI-based software stack | Mint - Mint",
                "One97 Communications Limited, which owns the brand Paytm...",
                "https://www.livemint.com/companies/news/paytm-eyes-india-scale-ai-system-ceo-sharma-says-company-investing-to-build-ai-based-software-stack-11692629182577.html",
                "https://www.livemint.com/lm-img/img/2023/08/21/600x338/pay_1692629810841_1692629811188.jpg",
                "2023-08-21T15:12:51Z",
                "One97 Communications Limited, which owns the brand Paytm, is investing in artificial intelligence..."
        ));

        arrayList.add(new TopStroiesModal(
                "CNBCTV18",
                "Jude Sannith",
                "Setting, Fight, Settlement: The Murugappa family feud, explained - CNBCTV18",
                "The Murugappa Family has announced a long-awaited resolution to their internal conflicts...",
                "https://www.cnbctv18.com/business/murugappa-family-feud-valli-arunachalam-vellayan-mm-murugappan-explained-17591871.htm",
                "https://images.cnbctv18.com/wp-content/uploads/2023/08/Murugappa-family-1019x573.jpg",
                "2023-08-21T14:55:23Z",
                null
        ));

        // Add the remaining 8 articles from the JSON
        arrayList.add(new TopStroiesModal(
                "The Times of India",
                "ET Online",
                "Mithun Sacheti's Rakesh Jhunjhunwala connection and his journey from Jaipur Gems to CaratLane - The Economic Times",
                "While shedding light on his initial foray into the e-commerce business, Sacheti said that he didnt realise...",
                "https://economictimes.indiatimes.com/news/new-updates/mithun-sachetis-rakesh-jhunjhunwala-connection-and-his-journey-from-jaipur-gems-to-caratlane/articleshow/102913796.cms",
                "https://economictimes.indiatimes.com/thumb/msid-102913835,width-1070,height-580,imgsize-53928,overlay-economictimes/photo.jpg",
                "2023-08-21T13:46:00Z",
                "Mithun Sacheti founded online jewellery selling platform CaratLane in 2008 along with Srinivasa Gopalan..."
        ));

        // Add the next 8 articles in the same manner...
        arrayList.add(new TopStroiesModal(
                "Livemint",
                "Fareha Naaz",
                "IFC to invest $100 million in IIFL Home Finance to increase access to housing finance for low-income groups in India | Mint - Mint",
                "IFC to invest $100m in IIFL Home Finance to increase access to housing finance for economically weaker sections in India.",
                "https://www.livemint.com/news/ifc-to-invest-100-million-in-iifl-home-finance-to-increase-access-to-housing-finance-for-low-income-groups-in-india-11692607656883.html",
                "https://www.livemint.com/lm-img/img/2023/08/21/600x338/LiveMint_1692608472091_1692608472262.jpg",
                "2023-08-21T13:36:50Z",
                "International Finance Corporation (IFC) is set to invest up to $100 million in IIFL Home Finance Limited..."
        ));

        arrayList.add(new TopStroiesModal(
                "Moneycontrol",
                "Bhavya Dilipkumar",
                "Bengaluru: Ola Uber challenger Namma Yatri app to charge subscription fee from drivers - Moneycontrol",
                "Auto Drivers will have two options: pay Rs 25 for unlimited trips per day, or Rs 3.50 per ride (no charges after 10 trips). The union says this is not a commission, but a subscription fee.",
                "https://www.moneycontrol.com/news/automobile/ola-uber-challenger-namma-yatri-app-to-charge-subscription-fee-from-drivers-11232151.html",
                "https://images.moneycontrol.com/static-mcnews/2023/04/Namma-yatri-770x431.jpg",
                "2023-08-21T13:36:33Z",
                "Namma Yatri, the auto-hailing app backed by the Autorickshaw Drivers Union (ARDU) of Bengaluru..."
        ));

        arrayList.add(new TopStroiesModal(
                "The Indian Express",
                "Sports Desk",
                "From the Ashes in 2023 to the World T20 in 2024: Cricket’s calendar in the next 6 months - The Indian Express",
                "This English summer of 2023 has been a busy one in terms of cricket, and for those who thought it couldn't get better...",
                "https://indianexpress.com/article/sports/cricket/from-the-ashes-in-2023-to-the-world-t20-in-2024-crickets-calendar-in-the-next-6-months-8053727/",
                "https://images.indianexpress.com/2023/08/GettyImages-1356634140.jpg",
                "2023-08-21T13:34:00Z",
                "The ongoing Ashes series will be followed by IPL 2023 which will be held in the United Arab Emirates (UAE)..."
        ));

        arrayList.add(new TopStroiesModal(
                "Hindustan Times",
                "Press Trust of India",
                "Arundhati Roy among 39 granted bail in Republic Day violence case - Hindustan Times",
                "Roy's application for exemption from appearance was allowed after the public prosecutor did not object...",
                "https://www.hindustantimes.com/india-news/arundhati-roy-among-39-granted-bail-in-republic-day-violence-case-101660851383172.html",
                "https://images.hindustantimes.com/img/2023/08/21/550x309/2023_08_21T132234Z_1129844976_RC2MBK9P17FI_RTRMADP_3_REPUBLIC-DAY-_2023_1629526904182.JPG",
                "2023-08-21T13:23:00Z",
                "The Delhi High Court on Sunday granted bail to 39 accused, including author Arundhati Roy and activist..."
        ));

        arrayList.add(new TopStroiesModal(
                "Business Today",
                "PTI",
                "Rail Land Development Authority to be reconstituted with fresh members: Govt - Business Today",
                "The Rail Land Development Authority (RLDA), which has been entrusted with the task of commercially exploiting...",
                "https://www.businesstoday.in/latest/economy/story/rail-land-development-authority-to-be-reconstituted-with-fresh-members-govt-317861-2023-08-21",
                "https://media2.businessworld.in/10_uploads/newsrail-land-dev-authority-to-be-reconstituted-with-fresh-membersgovt.jpg",
                "2023-08-21T12:37:39Z",
                "The Rail Land Development Authority (RLDA) will be reconstituted with fresh members, according to a government..."
        ));

        arrayList.add(new TopStroiesModal(
                "The News Minute",
                "Haripriya Suresh",
                "Mucormycosis cases in Telangana rise, but experts say nothing to worry about - The News Minute",
                "While officials did confirm the rise in cases, experts have said that there is nothing to worry about as the numbers are very low...",
                "https://www.thenewsminute.com/article/mucormycosis-cases-in-telangana-rise-but-experts-say-nothing-to-worry-about-169418",
                "https://images.thenewsminute.com/wp-content/uploads/2022/07/Mucormycosis.jpg",
                "2023-08-21T12:32:08Z",
                "The health department has confirmed that there has been an increase in the number of Mucormycosis cases in the state..."
        ));

        arrayList.add(new TopStroiesModal(
                "The Hindu",
                "Amarnath Tewary",
                "Over 24,000 get vaccinated on ‘My Village, My Pride’ campaign launch - The Hindu",
                "The Nitish Kumar government has fixed a target of vaccinating 50 lakh people in one day under the new vaccination...",
                "https://www.thehindu.com/news/national/over-24000-get-vaccinated-on-my-village-my-pride-campaign-launch/article65522557.ece",
                "https://www.thehindu.com/static/theme/default/base/img/og-image.jpg",
                "2023-08-21T12:21:00Z",
                "More than 24,000 people got vaccinated in Bihar on the launch day of the government’s ambitious 'My Village, My Pride'..."
        ));

        return arrayList;
    }
}
