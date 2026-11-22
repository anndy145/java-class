public abstract class DebugStorm {
   String stormName;
   int windSpeed;
   boolean severity;

   public DebugStorm(String name) {
      stormName = name;
   }

   public boolean equals(DebugStorm otherStorm) {
      boolean result;
      if (severity == otherStorm.severity)
         result = true;
      else
         result = false;
      return result;
   }

   public String toString() {
      String msg = "is not severe.";
      if (severity)
         msg = "is severe.";
      return ("The storm named " + stormName +
            " has a maximum wind speed of " + windSpeed +
            ", and this storm " + msg);
   }

   public abstract void setWindSpeed(int speed);
}