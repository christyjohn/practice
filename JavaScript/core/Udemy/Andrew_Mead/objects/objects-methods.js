let restaurant = {
    name: 'ASB',
    guestCapacity: 75,
    guestCount: 0,
    seatParty: function(partySize) {
        if (this.checkAvailability(partySize) === true) {
            this.guestCount += partySize
            let seatsLeft = this.guestCapacity - this.guestCount
            console.log(`Party of ${partySize} seated. Available seats ${seatsLeft}`)
        } else {
            console.log("No seats available currently, please wait.")
        }
    },
    removeParty: function(partySize) {
        if (this.guestCount - partySize >= 0) {
            this.guestCount -= partySize
        } else {
            console.log(`There aren't ${partySize} customers at the restaurant. Should I remove the available ${this.guestCount} customers?`)
        }
    },
    checkAvailability: function(partySize) {
        let seatsLeft = this.guestCapacity - this.guestCount
        return partySize < seatsLeft;
    }
}

restaurant.seatParty(72)
console.log(restaurant)
console.log(restaurant.checkAvailability(4))
restaurant.removeParty(5)
console.log(restaurant)
console.log( restaurant.checkAvailability(4))
restaurant.removeParty(85)