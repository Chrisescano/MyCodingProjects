# Supermarket Project README

You are developing a Java CLI program for a supermarket of your choice. The manager of the supermarket requires that the program have these following functions:
- Have a main menu
- Let consumers browse items and add to their shopping cart
- Print their receipt based on their shopping cart(must be formatted neatly)
- An option to quit the program at any point
- A checkout option that will print a goodbye message to the consumer

As the developer you have creative freedom on how to display information, but here are some options:
The main can look like this:
Possible commands:
  (B)rowse
  (P)rint
  (Q)uit
Type command:

Browse menu can look like this:
<Supermarket name> has the following items:
Apples   $1.00
Banana   $2.20
   ...

Possible commands:
  (A)dd to shopping cart - A <item-name> <quantity>
  (R)eturn to main menu
  (Q)uit
Type command:

Print menu can look like this:
Apple  x2  $2.00
Banana x1  $2.00
----------------
Total      $4.00

Possible commands:
  (C)heckout
  (R)eturn to main menu
Type command: