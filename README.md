# StringMerger

## How to use

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
