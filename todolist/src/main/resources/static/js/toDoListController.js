//development APIs
const addAPI= 'http://localhost:8080/todolist/add';
const displayAPI = 'http://localhost:8080/todolist/all';

let toDoListController = [];

function displayToDoList()
{
      //fetch data from database using the REST API endpoint from Spring Boot
      fetch(displayAPI)
          .then((resp) => resp.json())
          .then(function(data) {
              console.log("2. receive data")
              console.log(data);

              data.forEach(function (todolist) {
                  const todolistObj = {
                      id: todolist.id,
                      title: todolist.title,
                      description: todolist.description,
                      targetDate: todolist.targetDate
                 };

                  toDoListController.push(todolistObj);
            });

           //Display all the 12 objects from the toDoListController array
            renderToDoListPage();
          })
          .catch(function(error) {
              console.log(error);
          });
}

//(3)  Display all products when user launch the product.html page
function renderToDoListPage() {


   let display = "";


   for (let i = 0; i < toDoListController.length; i++ ) {

       display += `
           <tr>
               <td>${toDoListControllerList[i].title}</td>
               <td>${toDoListControllerList[i].description}</td>
               <td>${toDoListControllerList[i].targetDate}</td>
           </tr>
       `

   }

   document.querySelector("#tableBody").innerHTML = display;

} //End of renderToDoListPage function

function addToDoList(name, description, targetDate)
{
    // FormData us an Object provided by the Browser API for us to send the data over to the backend
   const formData = new FormData();
   formData.append('name', name);
   formData.append('description', description);
   formData.append('targetDate', targetDate);

  fetch(addAPI, {
        method: 'POST',
        body: formData
        })
        .then(function(response) {
            console.log(response.status); // Will show you the status - 200 ok, 500, 404
            if (response.ok) {
                alert("Successfully added to To-Do List!")
            }
            else {
               alert("An error occurred. Try again")
            }
        })
        .catch((error) => {
            console.error('Error:', error);
            alert("Error adding to the To-Do List")
        });
}
