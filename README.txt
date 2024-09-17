Brief Description of the Program
--------------------------------
This program simulates the cost calculations for a HybridVehicle that can run both on gasoline and electric power. The goal was to design interfaces for both Gasoline and Electric modes of transportation, then implement these interfaces in the HybridVehicle class. The program includes cost calculations for fully gasoline-powered trips, fully electric trips, and hybrid trips that combine both modes.

## How to Download and Run the System
You can clone the repository from the following link:

[Hybrid Vehicle Cost Calculator](https://ubiquitous-funicular-r4r9v5rj66wp25w6r.github.dev/)

```bash
git clone https://github.com/Angello-ops/Lab-1
cd hybrid-vehicle-cost-calculator

download the dependencies by typing the following in termninal
wget https://repo1.maven.org/maven2/junit/junit/4.13.2/junit-4.13.2.jar
wget https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar

first type in terminal "javac -cp junit-4.13.2.jar src/c/*.java src/u/*.java" then "java -cp ./src c.CarRunner"
and finally "java -cp "junit-4.13.2.jar:hamcrest-core-1.3.jar:./src/" org.junit.runner.JUnitCore u.HybridVehicleTests"

hopefully this this is what you're looking for    
