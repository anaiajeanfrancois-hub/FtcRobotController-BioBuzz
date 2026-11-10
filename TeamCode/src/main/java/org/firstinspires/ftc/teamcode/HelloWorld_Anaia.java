package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@Autonomous
public class HelloWorld_Anaia extends OpMode{
    @Override
    public void init(){
        telemetry.addData("Hello", "Anaia!");
    }
    @Override
    public void loop(){

    }
}
