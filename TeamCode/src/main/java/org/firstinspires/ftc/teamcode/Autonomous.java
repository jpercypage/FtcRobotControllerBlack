//package org.firstinspires.ftc.robotcontroller.external.samples;
package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp(name="Automatic Mode", group="OpMode thing")

public class Autonomous extends LinearOpMode {

    // Declare OpMode members for each of the 4 motors.
    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor FrontLeft = null;
    private DcMotor BackLeft = null;
    private DcMotor FrontRight = null;
    private DcMotor BackRight = null;

    @Override
    public void runOpMode() {

        //all this does right now is move each of the 4 motors
        FrontLeft = hardwareMap.get(DcMotor.class, "front_left_drive");
        FrontRight = hardwareMap.get(DcMotor.class, "front_right_drive");
        BackLeft = hardwareMap.get(DcMotor.class, "back_left_drive");
        BackRight = hardwareMap.get(DcMotor.class, "back_right_drive");

        FrontLeft.setDirection(DcMotor.Direction.REVERSE);
        FrontRight.setDirection(DcMotor.Direction.REVERSE);
        BackLeft.setDirection(DcMotor.Direction.REVERSE);
        BackRight.setDirection(DcMotor.Direction.REVERSE);

        telemetry.addData("Status", "Initialized"); telemetry.update();

        waitForStart();
        runtime.reset();

        while (opModeIsActive()) {

            FrontLeft.setPower(69);
            FrontRight.setPower(69);
            BackLeft.setPower(69);
            BackRight.setPower(69);

        }

    }

}
