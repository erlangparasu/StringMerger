# StringMerger

## Installation
Just copy `StringMerger.java` file to your project

## How to use
Example:
```java
ArrayList<StringMerger.Layer> layers = new ArrayList<>();
layers.add(new StringMerger.Layer("left", 4, "Abcdefghijklmnopqrstuvwxyz"));
layers.add(new StringMerger.Layer("left", 0, "6789"));
layers.add(new StringMerger.Layer("right", 0, "@Rp20.000"));
layers.add(new StringMerger.Layer("right", 9, "HELLO"));

StringMerger stringMerger = new StringMerger(30, ' ', layers);
//stringMerger.setMaxLength(30);
//stringMerger.setBgChar(' ');
//stringMerger.setLayers(layers);
String mergedString = stringMerger.getMergedString();

System.out.println(mergedString);

// Output:
// 6789AbcdefghijklHELLO@Rp20.000
```

## How it works
Concept:
```
Layer 0: '                              ' ---> initial 30 spaces
Layer 1: '    Abcdefghijklmnopqrstuvwxyz' ---> from left
Layer 2: '6789                          ' ---> from left
Layer 3: '                     @Rp20.000' ---> from right
Layer 4: '                HELLO         ' ---> from right

Result : '6789AbcdefghijklHELLO@Rp20.000' ---> output
```
