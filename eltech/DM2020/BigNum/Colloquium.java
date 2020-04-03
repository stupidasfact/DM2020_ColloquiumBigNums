package eltech.DM2020.BigNum;

import java.util.*;
import java.math.*;

public class Colloquium
{
	public static void start()
	{
		//Тестируте!)
		BigN a = new BigN("6194856");
		BigZ b = new BigZ("-1523156832235569513241236459168732159478123");
		System.out.println( a.multiply( new BigN("561392463") ).add( new BigN("5051") ) ); // 3477745467775379
		System.out.println("\n\t" + b);
	}
}

/*
12423157642376846892316943261948561392463217846297316482316498335129463240012423157642376846892316943261948561392463217846297316482316498335129463240012423157642376846892316943261948561392463217846297316482316498335129463240012423157642376846892316943261948561392463217846297316482316498335129463240012423157642376846892316943261948561392463217846297316482316498335129463240012423157642376846892316943261948561392463217846297316482316498335129463240062973164823164983351294632400124231576423768468923169432619485613924632178462973164823164983351294632400124231576423768468923169432619485613924632178462973164823164983351294632400124231576423768468923169432619485613962973164823164983351294632400124231576423768468923169432619485613924632178462973164823164983351294632400124231576423768468923169432619485613924632178462973164823164983351294632400124231576423768468923169432619485613924632178462973164823164983351294632400124231576423768468923169432619485613924632178462973164823164983351294632400629731648231649833512946324001242315764237684689231694326194856139246321784629

2135634297865987216458932168321542321356342978659872164589321683215423213563429786598721645893216832154232135634297865987216458932168321542321356342978659872164589321683215423943261948561392463217846297316482316498335129463240062973164823164983351294632400124231576423768468923169432619485613924632178462973164823164983351294632400124231576423768468923169432619485613924632178462973164823164983351294632400124231576423768468923169432619485613962973164823164983351294632400124231576423768468923169432619485613924632178462973164823164983351294632400124231576423768468923169432619485613924632178462973164823164983351294632400124231576423768468923169432619485613924632178462973164821645893216832154232135634297865987216458932168321542321356342978659872164589321683215423213563429786598721645893216832154239432619485613924632178462973164823164983351294632400629731648231649833512946324001242315764846297316482316498335129463240012423157642376846892316943261948561392463217846297316482316498335129463240012423157642376846892316943261948561396297316482316498335129463240012423157642376846892316943261948561392463217846297316482316498335129463240012423157642376846892316943261948561392463217846297316482316498335129463240012423157642376846892316943261948561392463217846297316482164589321683215423213563429786598721645893216832154232135634297865987216458932168321542321356342978659872164589321683215423943261948561321356342978659872164589321683215423213563429786598721645893216832154232135634297865987216458932168321542321356342978659872164589321683215423213563429786598721645893216832154239432619485613924632178462973164823164983351294632400629731648231649833512946324001242315764237684689231694326194856139246321784629731648231649833512946324001242315764237684689231694326194856139246321784629731648231649833512946324001242315764237684689231694326194856139629731648231649833512946324001242315764237684689231694326194856139246321784629731648231649833512946324001242315764237684689231694326194856139246321784629731648231649833512946324001242
*/