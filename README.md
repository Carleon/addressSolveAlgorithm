# Address processor
Simple algorithm to solve an array of strings to valid addresses.

## Example:
```
    // Normal cases
    {"Winterallee 3" will be => Address("Winterallee", "3")},
    {"Vittorio Alfieri 3" will be => Address("Vittorio Alfieri", "3")},
    {"Musterstrasse 45" will be => Address("Musterstrasse", "45")},
    {"Blaufeldweg 123B" will be => Address("Blaufeldweg", "123B")},
    {"Am Bächle 23" will be => Address("Am Bächle", "23")},
    {"Auf der Vogelwiese 23 b" will be => Address("Auf der Vogelwiese", "23 b")},

    // International cases
    {"4, rue de la revolution" will be => Address("rue de la revolution", "4")},
    {"200 Broadway Av" will be => Address("Broadway Av", "200")},
    {"Calle Aduana, 29" will be => Address("Calle Aduana", "29")},
    {"1540, Calle 45" will be => Address("Calle 45", "1540")},

    //Complex cases
    {"Calle 39 No 1540" will be => Address("Calle 39", "No 1540")},
    {"Viale Vitorio Alfieri 18 Number 1540" will be => Address("Viale Vitorio Alfieri 18", "Number 1540")},
          
```
