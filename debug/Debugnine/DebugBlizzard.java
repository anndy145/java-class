public class DebugBlizzard extends DebugStorm {
   public DebugBlizzard(String name, int speed) {
      super(name);
      setWindSpeed(speed);
   }

   @Override
   public void setWindSpeed(int speed) {
      super.windSpeed = speed;
      if (speed < 45)
         super.severity = false;
      else
         super.severity = true;
   }
}
