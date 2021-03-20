/*Copyright 2021 Pedro Bereilh Licensed under the Apache License, Version 2.0 (the "License"); 
you may not use this file except in compliance with the License. You may obtain a copy of 
the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable 
law or agreed to inwriting, software distributed under the License is distributed on an 
"AS IS" BASIS,WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
See the License for the specific language governing permissions andlimitations under the 
License.
*/
/**
 * @author pedrobereilh
 *
 */

public class Factorial{

  public static int factorial(int n){

  	return n == 0?1:n * factorial(n - 1);

  }

  public static void main(String[] args) {

    System.out.println("El factorial es " + factorial(3));

  }

}
