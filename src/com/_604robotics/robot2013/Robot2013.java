package com._604robotics.robot2013;

import com._604robotics.robot2013.modes.TeleopMode;
import com._604robotics.robot2013.modules.Drive;
import com._604robotics.robot2013.modules.Regulator;
import com._604robotics.robot2013.modules.Rotation;
import com._604robotics.robot2013.modules.Shifter;
import com._604robotics.robotnik.Robot;
import com._604robotics.robotnik.coordinator.ModeMap;
import com._604robotics.robotnik.module.ModuleMap;

public class Robot2013 extends Robot {
    public Robot2013 () {
        this.set(new ModuleMap() {{
            add("Drive", new Drive());
            add("Rotation", new Rotation());
            add("Regulator", new Regulator());
            add("Shifter", new Shifter());
        }});
        
        this.set(new ModeMap() {{
            setTeleopMode(new TeleopMode());
        }});
    }
}
