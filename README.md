# Address processor
Simple algorithm to solve an array of strings to valid addresses.

## Example:
```
    // Normal cases
    {"Winterallee 3", new Address("Winterallee", "3")},
    {"Vittorio Alfieri 3", new Address("Vittorio Alfieri", "3")},
    {"Musterstrasse 45", new Address("Musterstrasse", "45")},
    {"Blaufeldweg 123B", new Address("Blaufeldweg", "123B")},
    {"Am Bächle 23", new Address("Am Bächle", "23")},
    {"Auf der Vogelwiese 23 b", new Address("Auf der Vogelwiese", "23 b")},

    // International cases
    {"4, rue de la revolution", new Address("rue de la revolution", "4")},
    {"200 Broadway Av", new Address("Broadway Av", "200")},
    {"Calle Aduana, 29", new Address("Calle Aduana", "29")},
    {"1540, Calle 45", new Address("Calle 45", "1540")},

    //Complex cases
    {"Calle 39 No 1540", new Address("Calle 39", "No 1540")},
    {"Viale Vitorio Alfieri 18 Number 1540", new Address("Viale Vitorio Alfieri 18", "Number 1540")},
          
```
