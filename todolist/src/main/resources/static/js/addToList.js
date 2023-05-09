newItemForm.addEventListener('submit', (event) => {

   // Prevent default action
   event.preventDefault();

   // Select the inputs
   const title = document.querySelector('#newItemTitleInput').value;
   const description = document.querySelector('#newItemDescription').value;
   const targetDate = document.querySelector('#newItemTargetDate').value;

   /* 2)
       Do the Validation code here
   */

   // 3) Calls a function from the toDoListController.js to access the API to add items to the database
   addToDoList(title, description, targetDate);

});
