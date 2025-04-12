# A Deeper Dive Into Classes: String Methods Cheatsheet | Codecademy

[Skip to Content](#cheatsheets-page-heading)

-   [Codecademy Logo](/)
-   [My Home](/learn)
-   Catalog

    -   ## Popular course topics

        Explore free or paid courses in topics that interest you.

        [Explore all courses](/catalog)

        -   [

            Python

            ](/catalog/language/python)

        -   [

            JavaScript

            ](/catalog/language/javascript)

        -   [

            HTML & CSS

            ](/catalog/language/html-css)

        -   [

            SQL

            ](/catalog/language/sql)

        -   [

            Java

            ](/catalog/language/java)

        -   [

            C++

            ](/catalog/language/c-plus-plus)

        -   [

            C#

            ](/catalog/language/c-sharp)

        -   [

            C

            ](/catalog/language/c)

        -   [

            PHP

            ](/catalog/language/php)

        -   [

            R

            ](/catalog/language/r)

        -   [

            IT

            ](/catalog/subject/information-technology)

        -   [

            Cybersecurity

            ](/catalog/subject/cybersecurity)

        -   [Cloud computing](/catalog/subject/cloud-computing)
        -   [AI](/catalog/subject/artificial-intelligence)
        -   [Web development](/catalog/subject/web-development)
        -   [Data science](/catalog/subject/data-science)
        -   [Web design](/catalog/subject/web-design)
        -   [Professional skills](/catalog/subject/professional-skills)

        [

        New

        Prepare for top industry certifications — explore certification prep paths​.

        ](/catalog/certification-prep)

    -   ## Top career paths

        Choose your career. We'll teach you the skills to get job-ready.

        -   [Full-Stack Engineer](/learn/paths/full-stack-engineer-career-path)
        -   [Back-End Engineer](/learn/paths/back-end-engineer-career-path)
        -   [iOS Developer](/learn/paths/ios-developer)
        -   [Front-End Engineer](/learn/paths/front-end-engineer-career-path)
        -   [Computer Science](/learn/paths/computer-science)
        -   [Data Scientist](/pages/data-science-career-specializations)

    Not sure where to begin?

    [Take our quiz →](/explore/sorting-quiz)

-   Resources

    -   ## Docs

        Find definitions, code syntax, and more -- or contribute your own code documentation.

        [View all docs →](/resources/docs)[Contribute to docs →](/pages/contribute-docs)

        -   [C](/resources/docs/c)
        -   [HTML](/resources/docs/html)
        -   [Python](/resources/docs/python)
        -   [C++](/resources/docs/cpp)
        -   [Java](/resources/docs/java)
        -   [React](/resources/docs/react)
        -   [CSS](/resources/docs/css)
        -   [JavaScript](/resources/docs/javascript)
        -   [SQL](/resources/docs/sql)
        -   [Git](/resources/docs/git)
        -   [PHP](/resources/docs/php)
        -   [UI/UX](/resources/docs/uiux)

    -   ## Learning & practice tools

        -   [

            ### Articles

            Learn about technical concepts.](/articles)

        -   [

            ### Cheatsheets

            Review concepts from your courses.](/resources/cheatsheets/all)

        -   [

            ### Code challenges

            Test your knowledge and prep for interviews.](/code-challenges)

        -   [

            ### Projects

            Practice and build your portfolio.](/projects)

        -   [

            ### Videos

            Watch tutorials, project walkthroughs, and more.](/resources/videos)

        -   [

            ### Workspaces

            Build and share projects in your browser.](/pages/workspaces)

    -   ## Inspiration & career

        [View all blog topics →](/resources/blog)

        -   [

            ### Career advice

            Get answers to questions about coding careers.](/resources/blog/category/career/)

        -   [

            ### Learning tips

            Learn where to start and how to stay motivated.](/resources/blog/category/learning-tips/)

        -   [

            ### Job-readiness checker

            New

            Analyze your compatibility with tech roles using AI.](/job-readiness)

-   Community

    -   [Visit Community](https://community.codecademy.com/c/start-here/)
    -   [Events](/events)
    -   [Learner Stories](/resources/blog/category/learner-stories/)
    -   [Code Crew](https://try.codecademy.com/code-crew/)

-   [Career Center](/career-center)
-   [For Business](/business)

-   no unread
-   ![User profile avatar](https://www.gravatar.com/avatar/cd8b9b41556f394741302dec7a289d34?s=140&d=retro)

    -   [Profile Link](/profiles/me)
    -   [Account + Billing Link](/account)
    -   [My Home Link](/learn)
    -   [Help Center Link](/help)
    -   [Give Feedback Link](https://a.sprig.com/ZTFvMkttQTI0fnNpZDo4YzNkNDBiYS0zZDBmLTQyZDktOGQ3Yy00YzRhZWUxYzZkOGU=)
    -   [Log Out Link](/sign_out)

-   [Codecademy Logo](/)

-   no unread

Codecademy Logo

1.  [Cheatsheets](/resources/cheatsheets/all)/
2.  A Deeper Dive Into Classes

# String Methods

Print Cheatsheet

Share

## Topics

-   String Methods
-   [Access, Encapsulation, and Static Methods](/learn/paths/ap-computer-science-a/tracks/apcs-a-deeper-dive-into-classes/modules/apcs-access-encapsulation-and-static-methods/cheatsheet)

### length() String Method in Java

In Java, the `length()` string method returns the total number of characters – the length – of a `String`.

String str \= "Codecademy";

System.out.println(str.length());

// prints 10

to clipboard

### indexOf() String Method in Java

In Java, the `indexOf()` string method returns the first occurence of a character or a substring in a `String`. The character/substring that you want to find the index of goes inside of the `()`.

If `indexOf()` cannot find the character or substring, it will return -1.

String str \= "Hello World!";

System.out.println(str.indexOf("l"));

// prints 2

System.out.println(str.indexOf("Wor"));

// prints 6

System.out.println(str.indexOf("z"));

// prints -1

to clipboard

### concat() String Method in Java

In Java, the `concat()` string method is used to append one `String` to the end of another `String`. This method returns a `String` representing the text of the combined strings.

String s1 \= "Hello";

String s2 \= " World!";

String s3 \= s1.concat(s2);

// concatenates strings s1 and s2

System.out.println(s3);

// prints "Hello World!"

to clipboard

### String Method equals() in Java

In Java, the `equals()` string method tests for equality between two `String`s.

`equals()` compares the contents of each `String`. If all of the characters between the two match, the method returns `true`. If any of the characters do not match, it returns `false`.

Additionally, if you want to compare two strings without considering upper/lower cases, you can use `.equalsIgnoreCase()`.

String s1 \= "Hello";

String s2 \= "World";

System.out.println(s1.equals("Hello"));

// prints true

System.out.println(s2.equals("Hello"));

// prints false

System.out.println(s2.equalsIgnoreCase("world"));

// prints true

to clipboard

### charAt() String Method in Java

In Java, the `charAt()` string method returns the character of a `String` at a specified index. The index value is passed inside of the `()`, and should lie between 0 and `length()-1`.

String str \= "This is a string";

System.out.println(str.charAt(0));

// prints 'T'

System.out.println(str.charAt(15));

// prints 'g'

to clipboard

### toUpperCase() and toLowerCase() String Methods

In Java, we can easily convert a `String` to upper and lower case with the help of a few string methods:

-   `toUpperCase()` returns the string value converted to uppercase.
-   `toLowerCase()` returns the string value converted to lowercase.

String str \= "Hello World!";

String uppercase \= str.toUpperCase();

// uppercase = "HELLO WORLD!"

String lowercase \= str.toLowerCase();

// lowercase = "hello world!"

to clipboard

[

Next

](/learn/paths/ap-computer-science-a/tracks/apcs-a-deeper-dive-into-classes/modules/apcs-access-encapsulation-and-static-methods/cheatsheet)

Print Cheatsheet

Share

## Learn more on Codecademy

-   [

    Skill path

    ### Study for the AP Computer Science A Exam (Java)

    Master the core concepts covered in AP Computer Science A Exam and gain a solid understanding of programming and fluency in Java.

    Checker Dense

    Includes **8 Courses**

    Checker Dense

    With **Certificate**

    Checker Dense

    **Beginner** Friendly

    **19** hours

    ![](https://static-assets.codecademy.com/components/curriculum/path/ap-computer-science-a/curriculum-card.svg)

    ](/learn/paths/ap-computer-science-a)

## Company

-   [About](/about)
-   [Careers](/about/careers)
-   [Affiliates](/pages/codecademy-affiliate-program)
-   [Partnerships](/pages/partnerships)
-   -   [](https://twitter.com/Codecademy)
    -   [](https://codecademy.com/users/redirect?redirect_url=https://www.facebook.com/groups/codecademy.community)
    -   [](https://instagram.com/codecademy)
    -   [](https://www.youtube.com/channel/UC5CMtpogD_P3mOoeiDHD5eQ)
    -   [](https://www.tiktok.com/@codecademy)

## Resources

-   [Articles](/articles)
-   [Blog](https://codecademy.com/resources/blog)
-   [Cheatsheets](/resources/cheatsheets/all)
-   [Code challenges](/code-challenges)
-   [Docs](/resources/docs)
-   [Projects](/projects)
-   [Videos](/resources/videos)
-   [Workspaces](https://codecademy.com/pages/workspaces)

## Support

-   [Help Center](https://help.codecademy.com)
-   [Give feedback](https://a.sprig.com/ZTFvMkttQTI0fnNpZDo4YzNkNDBiYS0zZDBmLTQyZDktOGQ3Yy00YzRhZWUxYzZkOGU=)

## Resources

-   [Articles](/articles)
-   [Blog](https://codecademy.com/resources/blog)
-   [Cheatsheets](/resources/cheatsheets/all)
-   [Code challenges](/code-challenges)
-   [Docs](/resources/docs)
-   [Projects](/projects)
-   [Videos](/resources/videos)
-   [Workspaces](https://codecademy.com/pages/workspaces)

## Support

-   [Help Center](https://help.codecademy.com)
-   [Give feedback](https://a.sprig.com/ZTFvMkttQTI0fnNpZDo4YzNkNDBiYS0zZDBmLTQyZDktOGQ3Yy00YzRhZWUxYzZkOGU=)

## Plans

-   [For individuals](/pages/paid-plans)
-   [For students](/student-center)
-   [For business](/business)
-   [Discounts](/pages/codecademy-discount-codes)

## Community

-   [Visit community](https://community.codecademy.com/c/start-here/)
-   [Code Crew](https://try.codecademy.com/code-crew/)
-   [Events](/events)
-   [Learner Stories](https://www.codecademy.com/resources/blog/category/learner-stories)

Codecademy from Skillsoft

Codecademy from Skillsoft

## Subjects

-   [AI](/catalog/subject/artificial-intelligence)
-   [Cloud computing](/catalog/subject/cloud-computing)
-   [Code foundations](/catalog/subject/code-foundations)
-   [Computer science](/catalog/subject/computer-science)
-   [Cybersecurity](/catalog/subject/cybersecurity)
-   [Data analytics](/catalog/subject/data-analytics)
-   [Data science](/catalog/subject/data-science)
-   [Data visualization](/catalog/subject/data-visualization)
-   [Developer tools](/catalog/subject/developer-tools)
-   [DevOps](/catalog/subject/devops)
-   [Game development](/catalog/subject/game-development)
-   [IT](/catalog/subject/information-technology)
-   [Machine learning](/catalog/subject/machine-learning)
-   [Math](/catalog/subject/math)
-   [Mobile development](/catalog/subject/mobile-development)
-   [Web design](/catalog/subject/web-design)
-   [Web development](/catalog/subject/web-development)

## Languages

-   [Bash](/catalog/language/bash)
-   [C](/catalog/language/c)
-   [C++](/catalog/language/c-plus-plus)
-   [C#](/catalog/language/c-sharp)
-   [Go](/catalog/language/go)
-   [HTML & CSS](/catalog/language/html-css)
-   [Java](/catalog/language/java)
-   [JavaScript](/catalog/language/javascript)
-   [Kotlin](/catalog/language/kotlin)
-   [PHP](/catalog/language/php)
-   [Python](/catalog/language/python)
-   [R](/catalog/language/r)
-   [Ruby](/catalog/language/ruby)
-   [SQL](/catalog/language/sql)
-   [Swift](/catalog/language/swift)

## Career building

-   [Career paths](/catalog/all)
-   [Career Center](/career-center)
-   [Interview prep](/pages/interview-prep)
-   [Professional certification](/pages/pro-certifications)
-   [Compare to bootcamps](https://try.codecademy.com/bootcamps)
-   —
-   [Full catalog](/catalog/all)
-   [Beta content](/catalog/subject/beta)
-   [Roadmap](https://trello.com/b/vAgDXtT6/codecademy-releases-roadmap)

## Mobile

-   [![Download on the App Store](/_portal/_next/static/images/download-on-the-app-store.49ed17e50605b713ba01c8cd74032cae.svg)](https://itunes.apple.com/us/app/codecademy-go/id1376029326)
-   [![Get it on Google Play](/_portal/_next/static/images/get-it-on-google-play.a88e7c96e43f2f1a91b8cfd36104a3dc.png)](https://play.google.com/store/apps/details?id=com.ryzac.codecademygo)

## Mobile

-   [![Download on the App Store](/_portal/_next/static/images/download-on-the-app-store.49ed17e50605b713ba01c8cd74032cae.svg)](https://itunes.apple.com/us/app/codecademy-go/id1376029326)
-   [![Get it on Google Play](/_portal/_next/static/images/get-it-on-google-play.a88e7c96e43f2f1a91b8cfd36104a3dc.png)](https://play.google.com/store/apps/details?id=com.ryzac.codecademygo)

-   [Privacy Policy](/policy)
-   [Cookie Policy](/cookie-policy)
-   [Do Not Sell My Personal Information](https://privacy.codecademy.com)
-   [Terms](/terms)

Made with ❤️in NYC © 2025 Codecademy

<script id="__NEXT_DATA__" type="application/json">{"props":{"pageProps":{"course":{"__typename":"Track","id":"a31fbcb120a5ccef31e8ccc6c64b1ce3","slug":"apcs-a-deeper-dive-into-classes","title":"A Deeper Dive Into Classes","contentModules":[{"__typename":"ContentModule","id":"d4bdce5505f5358f3fefe0193624d403","slug":"apcs-string-methods","title":"String Methods"},{"__typename":"ContentModule","id":"afa66e73343f576900bfd3c0f7a49182","slug":"apcs-access-encapsulation-and-static-methods","title":"Access, Encapsulation, and Static Methods"}]},"module":{"__typename":"ContentModule","id":"d4bdce5505f5358f3fefe0193624d403","slug":"apcs-string-methods","title":"String Methods","reviewCards":[{"__typename":"ReviewCard","id":"5ddab05bed7e1d001192c1f3","title":"length() String Method in Java ","body":"In Java, the `length()` string method returns the total number of characters – the length – of a `String`.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5dddaea7fa224a0012d32413","language":"java","text":"String str = \"Codecademy\"; \n\nSystem.out.println(str.length());\n// prints 10"}]},{"__typename":"ReviewCard","id":"5ddb00cf7ec7c50012b6ef58","title":"indexOf() String Method in Java","body":"In Java, the `indexOf()` string method returns the first occurence of a character or a substring in a `String`. The character/substring that you want to find the index of goes inside of the `()`. \n\nIf `indexOf()` cannot find the character or substring, it will return -1. ","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5dddb499c9ce030013100234","language":"java","text":"String str = \"Hello World!\";\n\nSystem.out.println(str.indexOf(\"l\"));\n// prints 2\n\nSystem.out.println(str.indexOf(\"Wor\"));\n// prints 6\n\nSystem.out.println(str.indexOf(\"z\"));\n// prints -1"}]},{"__typename":"ReviewCard","id":"5dd9b5f34f86660011bcf658","title":"concat() String Method in Java","body":"In Java, the `concat()` string method is used to append one `String` to the end of another `String`. This method returns a `String` representing the text of the combined strings.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5ddda87602f826001160240b","language":"java","text":"String s1 = \"Hello\";\nString s2 = \" World!\";\n\nString s3 = s1.concat(s2);\n// concatenates strings s1 and s2\n\nSystem.out.println(s3);\n// prints \"Hello World!\""}]},{"__typename":"ReviewCard","id":"5dd94dfd4f86660011bcf539","title":"String Method equals() in Java ","body":"In Java, the `equals()` string method tests for equality between two `String`s. \n\n`equals()` compares the contents of each `String`. If all of the characters between the two match, the method returns `true`. If any of the characters do not match, it returns `false`.\n\nAdditionally, if you want to compare two strings without considering upper/lower cases, you can use `.equalsIgnoreCase()`.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5ddd9f1070a8e100115796d5","language":"java","text":"String s1 = \"Hello\";\nString s2 = \"World\";\n\nSystem.out.println(s1.equals(\"Hello\"));\n// prints true\n\nSystem.out.println(s2.equals(\"Hello\"));\n// prints false \n\nSystem.out.println(s2.equalsIgnoreCase(\"world\"));\n// prints true "}]},{"__typename":"ReviewCard","id":"5dd98bf455a885001260884f","title":"charAt() String Method in Java","body":"In Java, the `charAt()` string method returns the character of a `String` at a specified index. The index value is passed inside of the `()`, and should lie between 0 and `length()-1`.","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5ddda5c581a7fd001121b77c","language":"java","text":"String str = \"This is a string\";\n\nSystem.out.println(str.charAt(0));\n// prints 'T'\n\nSystem.out.println(str.charAt(15));\n// prints 'g'"}]},{"__typename":"ReviewCard","id":"5ddad625af3e6700129ca1b8","title":"toUpperCase() and toLowerCase() String Methods","body":"In Java, we can easily convert a `String` to upper and lower case with the help of a few string methods:\n\n- `toUpperCase()` returns the string value converted to uppercase.\n\n- `toLowerCase()` returns the string value converted to lowercase.\n","images":[],"codeSnippets":[{"__typename":"CodeSnippet","id":"5dddb38130af480013ace0ac","language":"java","text":"String str = \"Hello World!\";\n\nString uppercase = str.toUpperCase();\n// uppercase = \"HELLO WORLD!\"\n\nString lowercase = str.toLowerCase();\n// lowercase = \"hello world!\""}]}],"tracks":[{"__typename":"Track","released":false,"id":"a31fbcb120a5ccef31e8ccc6c64b1ce3","slug":"apcs-a-deeper-dive-into-classes","title":"A Deeper Dive Into Classes","lessonCount":3,"contentModuleIds":["d4bdce5505f5358f3fefe0193624d403","afa66e73343f576900bfd3c0f7a49182"],"grantsCertificate":true,"enrollmentStatus":"none","pro":false,"shortDescription":"Take a deeper look at how classes work in Java. Explore String methods as well as some of the more advanced features of your own classes.","difficulty":"Beginner","metrics":{"__typename":"TrackMetricsType","medianDurationHours":null}}],"paths":[{"__typename":"Path","released":true,"id":"5fc508b822eca90012fb25eb","slug":"ap-computer-science-a","goal":"skill","title":"Study for the AP Computer Science A Exam (Java)","lessonCount":23,"trackCount":8,"enrollmentStatus":"none","shortDescription":"Master the core concepts covered in AP Computer Science A Exam and gain a solid understanding of programming and fluency in Java.","difficulty":"Beginner","metrics":{"__typename":"PathMetricsType","medianDurationHours":19.34}}]},"reviewCards":[{"id":"5ddab05bed7e1d001192c1f3","title":"length() String Method in Java ","body":"In Java, the `length()` string method returns the total number of characters – the length – of a `String`.","images":[],"codeSnippets":[{"id":"5dddaea7fa224a0012d32413","language":"java","text":"String str = \"Codecademy\"; \n\nSystem.out.println(str.length());\n// prints 10"}]},{"id":"5ddb00cf7ec7c50012b6ef58","title":"indexOf() String Method in Java","body":"In Java, the `indexOf()` string method returns the first occurence of a character or a substring in a `String`. The character/substring that you want to find the index of goes inside of the `()`. \n\nIf `indexOf()` cannot find the character or substring, it will return -1. ","images":[],"codeSnippets":[{"id":"5dddb499c9ce030013100234","language":"java","text":"String str = \"Hello World!\";\n\nSystem.out.println(str.indexOf(\"l\"));\n// prints 2\n\nSystem.out.println(str.indexOf(\"Wor\"));\n// prints 6\n\nSystem.out.println(str.indexOf(\"z\"));\n// prints -1"}]},{"id":"5dd9b5f34f86660011bcf658","title":"concat() String Method in Java","body":"In Java, the `concat()` string method is used to append one `String` to the end of another `String`. This method returns a `String` representing the text of the combined strings.","images":[],"codeSnippets":[{"id":"5ddda87602f826001160240b","language":"java","text":"String s1 = \"Hello\";\nString s2 = \" World!\";\n\nString s3 = s1.concat(s2);\n// concatenates strings s1 and s2\n\nSystem.out.println(s3);\n// prints \"Hello World!\""}]},{"id":"5dd94dfd4f86660011bcf539","title":"String Method equals() in Java ","body":"In Java, the `equals()` string method tests for equality between two `String`s. \n\n`equals()` compares the contents of each `String`. If all of the characters between the two match, the method returns `true`. If any of the characters do not match, it returns `false`.\n\nAdditionally, if you want to compare two strings without considering upper/lower cases, you can use `.equalsIgnoreCase()`.","images":[],"codeSnippets":[{"id":"5ddd9f1070a8e100115796d5","language":"java","text":"String s1 = \"Hello\";\nString s2 = \"World\";\n\nSystem.out.println(s1.equals(\"Hello\"));\n// prints true\n\nSystem.out.println(s2.equals(\"Hello\"));\n// prints false \n\nSystem.out.println(s2.equalsIgnoreCase(\"world\"));\n// prints true "}]},{"id":"5dd98bf455a885001260884f","title":"charAt() String Method in Java","body":"In Java, the `charAt()` string method returns the character of a `String` at a specified index. The index value is passed inside of the `()`, and should lie between 0 and `length()-1`.","images":[],"codeSnippets":[{"id":"5ddda5c581a7fd001121b77c","language":"java","text":"String str = \"This is a string\";\n\nSystem.out.println(str.charAt(0));\n// prints 'T'\n\nSystem.out.println(str.charAt(15));\n// prints 'g'"}]},{"id":"5ddad625af3e6700129ca1b8","title":"toUpperCase() and toLowerCase() String Methods","body":"In Java, we can easily convert a `String` to upper and lower case with the help of a few string methods:\n\n- `toUpperCase()` returns the string value converted to uppercase.\n\n- `toLowerCase()` returns the string value converted to lowercase.\n","images":[],"codeSnippets":[{"id":"5dddb38130af480013ace0ac","language":"java","text":"String str = \"Hello World!\";\n\nString uppercase = str.toUpperCase();\n// uppercase = \"HELLO WORLD!\"\n\nString lowercase = str.toLowerCase();\n// lowercase = \"hello world!\""}]}],"relatedContent":[{"id":"5fc508b822eca90012fb25eb","slug":"ap-computer-science-a","urlPath":"/learn/paths/ap-computer-science-a","imageUrl":"https://static-assets.codecademy.com/components/curriculum/path/ap-computer-science-a/curriculum-card.svg","goal":"skill","title":"Study for the AP Computer Science A Exam (Java)","lessonCount":23,"courseCount":8,"enrollmentStatus":"none","shortDescription":"Master the core concepts covered in AP Computer Science A Exam and gain a solid understanding of programming and fluency in Java.","difficulty":"Beginner","timeToComplete":19,"hasCareerJourney":false,"type":"path"}],"pathSlug":"ap-computer-science-a","__NEXTJS_CONTEXT__":{"cookie":null,"isPreview":false}},"__N_SSG":true},"page":"/learn/paths/[pathSlug]/tracks/[courseSlug]/modules/[moduleSlug]/cheatsheet","query":{"pathSlug":"ap-computer-science-a","courseSlug":"apcs-a-deeper-dive-into-classes","moduleSlug":"apcs-string-methods"},"buildId":"portal-app-10b4a003571504fb0cc6f52c5fa4b3ba2701e379","assetPrefix":"/_portal","isFallback":false,"isExperimentalCompile":false,"gsp":true,"scriptLoader":[]}</script>

<style>:root { --onetrust-brand-purple: #3A10E5; --onetrust-color-gray-500: #828285; --onetrust-color-white: #fff; } #onetrust-banner-sdk { padding: 1rem !important; } #onetrust-banner-sdk > .ot-sdk-container { width: 100% !important; } #onetrust-banner-sdk > .ot-sdk-container > .ot-sdk-row { display: flex !important; flex-direction: column !important; align-items: center !important; max-width: 1436px !important; margin: 0 auto !important; } #onetrust-banner-sdk > .ot-sdk-container > .ot-sdk-row:after { content: none !important; } #onetrust-banner-sdk > div > .ot-sdk-container > .ot-sdk-row { display: flex !important; flex-direction: column !important; align-items: center !important; max-width: 1436px !important; margin: 0 auto !important; } #onetrust-banner-sdk > div > .ot-sdk-container > .ot-sdk-row:after { content: none !important; } #onetrust-group-container { display: flex !important; justify-content: center; float: none !important; width: 100% !important; max-width: 1148px !important; margin-left: 0 !important; margin-bottom: 0.625rem !important; } #onetrust-policy, #onetrust-policy-text { margin: 0 !important; font-size: 0.875rem !important; line-height: 1.375rem !important; text-align: center !important; float: none !important; } #onetrust-policy-text a { text-decoration: none; line-height: 26px !important; margin-left: 0 !important; } #onetrust-button-group-parent { position: relative !important; top: initial !important; left: initial !important; transform: initial !important; width: 264px !important; margin: 0 !important; padding: 0 !important; float: none !important; } #onetrust-button-group { display: flex !important; margin: 0 !important; } #onetrust-pc-btn-handler, #onetrust-accept-btn-handler { min-width: initial !important; padding: 0.375rem 1rem !important; margin: 0 !important; opacity: 1 !important; border-radius: 2px !important; line-height: 1.5 !important; user-select: none !important; font-size: 1rem !important; } #onetrust-pc-btn-handler:focus, #onetrust-accept-btn-handler:focus { box-shadow: 0 0 0 2px var(--onetrust-color-white), 0 0 0 4px var(--onetrust-brand-purple); text-decoration: none !important; outline: none !important; } #onetrust-pc-btn-handler{ color: var(--onetrust-brand-purple) !important; border: 1px solid var(--onetrust-brand-purple)!important; background: var(--onetrust-color-white) !important } #onetrust-accept-btn-handler { color: var(--onetrust-color-white) !important; background: var(--onetrust-brand-purple)!important; margin-left: 1rem !important; } #onetrust-close-btn-container { display: none !important; } .pc-logo { display: none !important; } #accept-recommended-btn-handler, .ot-pc-refuse-all-handler, .save-preference-btn-handler { margin-left: 4px !important; font-size: 14px !important; } #accept-recommended-btn-handler:focus, #onetrust-pc-sdk .ot-pc-refuse-all-handler:focus, #onetrust-pc-sdk .save-preference-btn-handler:focus { box-shadow: 0 0 0 2px var(--onetrust-color-white), 0 0 0 4px var(--onetrust-brand-purple); text-decoration: none !important; outline: none !important; opacity: 1 !important; } .ot-switch-label { border: 1px solid var(--onetrust-color-gray-500) !important; background-color: var(--onetrust-color-gray-500) !important; } .ot-switch-nob { background: var(--onetrust-color-white) !important; } .ot-switch-inner:before { background-color: var(--onetrust-brand-purple) !important; } .switch-checkbox:checked+.ot-switch-label .ot-switch-nob { border-color: var(--onetrust-brand-purple) !important; } .ot-pc-footer-logo { display: none !important; } #onetrust-banner-sdk>.ot-sdk-container { overflow: visible !important; } #onetrust-pc-sdk .category-item .ot-switch.ot-toggle input:focus + .ot-switch-label { outline-color: var(--onetrust-brand-purple) !important; } #onetrust-pc-sdk .category-item .ot-switch.ot-toggle input:focus+.ot-switch-label { outline-width: 3px !important; outline-offset: 2px !important; } @media (max-width: 30rem) { #accept-recommended-btn-handler, .ot-pc-refuse-all-handler, .save-preference-btn-handler { width: 96% !important; } } @media (min-width: 37.5rem) { #onetrust-banner-sdk { padding: 0.875rem 1rem !important; } } @media (min-width: 48rem) { #onetrust-banner-sdk { padding: 0.875rem 1.25rem !important; } } @media (min-width: 1650px) { #onetrust-banner-sdk > .ot-sdk-container > .ot-sdk-row { flex-direction: row !important; justify-content: space-between !important; } #onetrust-banner-sdk > div > .ot-sdk-container > .ot-sdk-row { flex-direction: row !important; justify-content: space-between !important; } #onetrust-group-container { margin-bottom: 0 !important; } #onetrust-button-group { flex-direction: row !important; } }</style>

![Company Logo](https://cdn.cookielaw.org/logos/static/ot_company_logo.png)

## Privacy Preference Center

When you visit any website, it may store or retrieve information on your browser, mostly in the form of cookies. This information might be about you, your preferences or your device and is mostly used to make the site work as you expect it to. The information does not usually directly identify you, but it can give you a more personalized web experience. Because we respect your right to privacy, you can choose not to allow some types of cookies. Click on the different category headings to find out more and change our default settings. However, blocking some types of cookies may impact your experience of the site and the services we are able to offer.  
[More information](https://cookiepedia.co.uk/giving-consent-to-cookies)

Allow All

### Manage Consent Preferences

#### Strictly Necessary Cookies

Always Active

Strictly Necessary Cookies

These cookies are necessary for the website to function and cannot be switched off in our systems. They are usually only set in response to actions made by you which amount to a request for services, such as setting your privacy preferences, logging in or filling in forms. You can set your browser to block or alert you about these cookies, but some parts of the site will not then work. These cookies do not store any personally identifiable information.

#### Functional Cookies

Functional Cookies

These cookies enable the website to provide enhanced functionality and personalisation. They may be set by us or by third party providers whose services we have added to our pages. If you do not allow these cookies then some or all of these services may not function properly.

#### Targeting Cookies

Targeting Cookies

These cookies may be set through our site by our advertising partners. They may be used by those companies to build a profile of your interests and show you relevant adverts on other sites. They do not store directly personal information, but are based on uniquely identifying your browser and internet device. If you do not allow these cookies, you will experience less targeted advertising.

#### Performance Cookies

Performance Cookies

These cookies allow us to count visits and traffic sources so we can measure and improve the performance of our site. They help us to know which pages are the most and least popular and see how visitors move around the site. All information these cookies collect is aggregated and therefore anonymous. If you do not allow these cookies we will not know when you have visited our site, and will not be able to monitor its performance.

Reject All Confirm My Choices

[![Powered by Onetrust](https://cdn.cookielaw.org/logos/static/powered_by_logo.svg "Powered by OneTrust Opens in a new Tab")](https://www.onetrust.com/products/cookie-consent/)

Back Button

Back

### Performance Cookies

Vendor Search Search Icon Filter Icon

Clear Filters

Information storage and access

Apply

Consent Leg.Interest

All Consent Allowed

Select All Vendors

Select All Vendors

All Consent Allowed

Reject All Confirm My Choices

[![Powered by Onetrust](https://cdn.cookielaw.org/logos/static/powered_by_logo.svg "Powered by OneTrust Opens in a new Tab")](https://www.onetrust.com/products/cookie-consent/)

<iframe class="ot-text-resize" sandbox="allow-same-origin" title="onetrust-text-resize" style="position: absolute; top: -50000px; width: 100em;" aria-hidden="true"></iframe>

## Embedded Content
