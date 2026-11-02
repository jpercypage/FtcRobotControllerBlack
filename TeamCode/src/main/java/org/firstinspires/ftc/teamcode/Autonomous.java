package org.firstinspires.ftc.robotcontroller.external.samples;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp(name="Automatic Mode", group="OpMode thing")

public class BasicOmniOpMode_Linear extends LinearOpMode {

    // Declare OpMode members for each of the 4 motors.
    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor FrontLeft = null;
    private DcMotor BackLeft = null;
    private DcMotor FrontRight = null;
    private DcMotor BackRight = null;

    @Override
    public void runOpMode() {

        FrontLeft = hardwareMap.get(DcMotor.class, "front_left_drive");
        FrontRight = hardwareMap.get(DcMotor.class, "front_right_drive");
        BackLeft = hardwareMap.get(DcMotor.class, "back_left_drive");
        BackRight = hardwareMap.get(DcMotor.class, "back_left_drive");

        FrontLeft.setDirection(DcMotor.Direction.REVERSE);
        FrontRight.setDirection(DcMotor.Direction.REVERSE);
        BackLeft.setDirection(DcMotor.Direction.REVERSE);
        BackRight.setDirection(DcMotor.Direction.REVERSE);

        telemetry.addData("Status", "Initialized"); telemetry.update();

        waitForStart();
        runtime.reset();

        while (opModeIsActive()) {
            //double max; //???

            // Combine the joystick requests for each axis-motion to determine each wheel's power.
            // Set up a variable for each drive wheel to save the power level for telemetry.
            //double motorPower  = axial + lateral + yaw;

            // Normalize the values so no wheel power exceeds 100%
            // This ensures that the robot maintains the desired motion.
            //max = Math.max(Math.abs(motorPower),

            //if (max > 1.0) {

           //     motorPower  /= max;
            //}

            FrontLeft.setPower(69);
            FrontRight.setPower(69);
            BackLeft.setPower(69);
            BackRight.setPower(69);

        }

    }

}
