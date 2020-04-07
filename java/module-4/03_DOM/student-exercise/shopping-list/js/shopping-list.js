// add pageTitle
const name = 'My Shopping List';
const description = 'Here is our shopping list';

// add groceries
const groceries = [
  {groceries = 'Milk'},
  {groceries = 'Eggs'},
  {groceries = 'Steak'},
  {groceries = 'Mushrooms'},
  {groceries = 'Chocolate'},
  {groceries = 'Avocados'},
  {groceries = 'Bacon'},
  {groceries = 'Salsa'},
  {groceries = 'Chips'},
  {groceries = 'Blue Cheese'}
]


/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */

 const theTitle = "A Title"
function setPageTitle() {
  let pageTitle = document.getElementById('title');
  theTitle.innerText = aTitle;
}
/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const list = document.getElementById('groceries')
  getList.forEach((hold)=>{
    const item = document.createElement('li')
    item.innerText = hold
    list.appendChild(item)
  })
}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  let item = document.getElementById('items')
  item.setAttribute("class", "completed")
}

 setPageTitle() 

displayGroceries() 

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
