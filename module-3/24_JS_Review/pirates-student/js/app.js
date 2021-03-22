/*
* Add Events and functions to move the Ship and Win the game
*/

// Creates the Grid -- this should only occur after the DOM loads

document.addEventListener('')

createGrid();
document.querySelector('body').addEventListener('keydown', (event) =>{



}
// isLoss func - return with a logical opperatior


);


function moveShipRight(){
    const ship = getShipLocation();
    const right = ship.nextElementSibling;
    moveShip(ship,right);
 

}

function moveShipDown () {

    const ship = getShipLocation();
    const rowBelow = ship.parentElement.nextElementSibling
}



// function move ship (oldLocation, newLocation)


//function get ship location




/**
 * Reset the Game
 */
function resetGame() {

    // Create the Obstacles
    createObstacles();
    // Inform the user they can start

   // Set the starting location of the boat and treasure
    const frame = document.getElementById('frame');
    frame.firstElementChild.firstElementChild.classList.add('boat');
}


/**
 * Creates the game grid
 */
function createGrid() {

    const frame = null; // get a reference to the frame

    // Add Code to create the game grid
    for (let i = 0; i < 10 ; i++) {
        buildRow(frame); 
    }
    resetGame();
}

/**
 * Builds the grid rows
 * @param {HTMLElement} frame 
 */
function buildRow(frame) {
    const row = document.createElement('div');
    row.classList.add('row');
    frame.insertAdjacentElement('beforeend',row);
    for (let i = 0; i < 10 ; i++) {
        buildSquare(row, i); 
    }    
}

/**
 * Builds the grid squares 
 * @param {HTMLElement} row 
 * @param {int} count 
 */
function buildSquare(row, count) {
   // Add code to create the grid Squares and add them to the row
const cell = document.createElement('div');
    cell.classList.add('');    
}

function createObstacles(){



// loop over all the cells in all the rows
// for each cell call addObstacles(cell)
// only if cell is not boat or treasure  


    const rows = document.querySelectorAll('.row');
    rows.forEach((row, rowIndex) => {
        const cell = row.children;
        Array.from(cells).forEach(cell, cellIndex) => {
            if(!(rowIndex ==0 && cellIndex ==0) && !(rowIndex == rows.length -1 && cellIndex == cells.length -1)) {
                addObstacles(cell);

            };
            
        };


    });
}


/**
 * Adds random obstacles to a game cell
 * 
 * @param {HTMLElement} cell 
 */
function addObstacles(cell) {

    // remove any existing pirates or icebergs
    cell.classList.remove('pirate');
    cell.classList.remove('iceberg');

    const rand = Math.floor(Math.random() * 100) + 1;

    if (rand > 85) {
        // Add pirates here
        cell.classList.add('pirate');
    } else if (rand > 80) {
        // Add iceberg here
        cell.classList.add('iceberg');
    } 
}




