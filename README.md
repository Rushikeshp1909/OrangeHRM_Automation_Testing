In this project, I've created a complete testing suite for OrangeHRM's EMS, focusing on both functionality & user-friendliness.

𝟏.𝐋𝐨𝐠𝐢𝐧 𝐏𝐫𝐨𝐜𝐞𝐬𝐬 :
• Used Selenium WebDriver to automate logging into OrangeHRM.
• Located the username and password fields and filled them using simple locators like 'name', & simulated clicking on login button to access platform.

𝟐.𝐍𝐚𝐯𝐢𝐠𝐚𝐭𝐢𝐧𝐠 𝐏𝐈𝐌 𝐌𝐨𝐝𝐞𝐥 :
• Ensured seamless navigation between different modules of the OrangeHRM application.
• Made sure transitions btw PIM module are smooth for continuous testing.

𝟑.𝐀𝐝𝐝𝐢𝐧𝐠 𝐄𝐦𝐩𝐥𝐨𝐲𝐞𝐞 :
• Automated employee addition with clear input and confirmation messages.
• Navigated to "Add Employee" page, filled in required details.
• Used conditional statements to display msg confirming successful addition.

𝟒.𝐃𝐞𝐥𝐞𝐭𝐢𝐧𝐠 𝐄𝐦𝐩𝐥𝐨𝐲𝐞𝐞 :
• Implemented deletion automation with clear feedback and confirmation messages for users.
• Located the employee record using XPath and selected it for deletion.
• Provided a clear confirmation by clicking on the "Yes, Delete" button.

𝟓.𝐇𝐚𝐧𝐝𝐥𝐢𝐧𝐠 𝐒𝐮𝐜𝐜𝐞𝐬𝐬 𝐌𝐞𝐬𝐬𝐚𝐠𝐞𝐬 :
• Implemented conditional statements to check for expected success messages like "Successfully Saved" and "Successfully Deleted".
• Compared displayed messages with expected outcomes to provide clear feedback to users.

𝟔.𝐋𝐨𝐠𝐨𝐮𝐭 𝐏𝐫𝐨𝐜𝐞𝐬𝐬 :
• Ensured a seamless logout process for users by locating and clicking on the logout button.
• Properly terminated the session to maintain system integrity and provide users with a clear way to end their session.

𝐋𝐨𝐜𝐚𝐭𝐨𝐫𝐬 𝐔𝐬𝐞𝐝 :

𝟏.𝐍𝐚𝐦𝐞 𝐋𝐨𝐜𝐚𝐭𝐨𝐫: Used for elements like username and password fields. 

𝟐.𝐗𝐏𝐚𝐭𝐡 𝐋𝐨𝐜𝐚𝐭𝐨𝐫: Used for complex element for selection and navigating. 

𝟑.𝐓𝐚𝐠 𝐍𝐚𝐦𝐞 𝐋𝐨𝐜𝐚𝐭𝐨𝐫: Employed for elements like buttons, ensuring consistency & familiarity for users.


𝐊𝐞𝐲 𝐇𝐢𝐠𝐡𝐥𝐢𝐠𝐡𝐭𝐬:

1.Covered critical test scenarios from login to employee addition, search, and deletion.

2.Utilized SW for automation, Java for scripting & XPath for locating web elements.

3.Implemented efficient waits to synchronize test execution & employed result verification techniques.
