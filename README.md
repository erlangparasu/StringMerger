# StringMerger

## How to use

```java
ArrayList<StringMerger.Layer> layers = new ArrayList<>();
layers.add(new StringMerger.Layer("left", 4, "Abcdefghijklmnopqrstuvwxyz"));
layers.add(new StringMerger.Layer("left", 0, "1x2 "));
layers.add(new StringMerger.Layer("right", 0, " Rp20.000"));
layers.add(new StringMerger.Layer("right", 9, "HELLO"));

StringMerger stringMerger = new StringMerger(30, ' ', layers);
String mergedString = stringMerger.getMergedString();

System.out.println(mergedString);

// Output:
// 1x2 AbcdefghijklHELLO Rp20.000
```
