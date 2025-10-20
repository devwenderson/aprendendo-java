# To format numbers
## `NumberFormat` class

````java
import java.text.NumberFormat;
import java.util.Locale;

NumberFormat formatadorBr = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
String preco = formatadorBr.format(this.preco);
````