def switch_demo(argument):
    switch = {
        1: "one",
        2: "two",
        3: "three",
        4: "four",
        5: "five",
        6: "six",
        7: "seven",
        8: "eight",
        9: "nine",
        10: "ten",
        
    }
    print switch.get(argument,"Enter no between 1 to 10")
arg=input("Enter a number\n")
switch_demo(arg)
