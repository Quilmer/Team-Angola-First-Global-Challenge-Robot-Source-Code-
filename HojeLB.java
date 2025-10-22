package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "TeamAngola_TeleOp2025")
public class TeamAngola_TeleOp2025 extends LinearOpMode {

    private DcMotor MD0;
    private DcMotor ME1;
    private DcMotor Brac;
    private DcMotor Sug;
    private DcMotor Sug2;
    private DcMotor MPenD0;
    private DcMotor MPenE1;
    private DcMotor Ace;
    private CRServo Sright;
    private CRServo Sleft;
    private Servo Braleft;
    private Servo Braright;

    @Override
    public void runOpMode() {
        float x;
        float y;
        float Power0;
        float Power1;
        float Powerbrac;

        // Initialize hardware mapping
        MD0 = hardwareMap.get(DcMotor.class, "MD0");
        ME1 = hardwareMap.get(DcMotor.class, "ME1");
        Brac = hardwareMap.get(DcMotor.class, "Brac");
        Sug = hardwareMap.get(DcMotor.class, "Sug");
        Sug2 = hardwareMap.get(DcMotor.class, "Sug2");
        MPenD0 = hardwareMap.get(DcMotor.class, "MPenD0");
        MPenE1 = hardwareMap.get(DcMotor.class, "MPenE1");
        Ace = hardwareMap.get(DcMotor.class, "Ace");
        Sright = hardwareMap.get(CRServo.class, "Sright");
        Sleft = hardwareMap.get(CRServo.class, "Sleft");
        Braleft = hardwareMap.get(Servo.class, "Braleft");
        Braright = hardwareMap.get(Servo.class, "Braright");

        // Reverse one side for tank drive
        MD0.setDirection(DcMotor.Direction.REVERSE);
        ME1.setDirection(DcMotor.Direction.FORWARD);

        waitForStart();

        if (opModeIsActive()) {
            while (opModeIsActive()) {
                // Main drive control (arcade style)
                x = -gamepad1.left_stick_x;
                y = -gamepad1.left_stick_y;
                Power0 = y - x;
                Power1 = y + x;
                MD0.setPower(Power0);
                ME1.setPower(Power1);

                // Arm control
                x = -gamepad1.right_stick_x;
                y = -gamepad1.right_stick_y;
                Powerbrac = y;
                Brac.setPower(Powerbrac);

                // Intake forward
                if (gamepad1.right_bumper) {
                    Sug.setPower(-1);
                    Sug2.setPower(1);
                } 
                // Intake reverse
                else if (gamepad1.left_bumper) {
                    Sug.setPower(1);
                    Sug2.setPower(-1);
                } 
                // Stop intake
                else if (gamepad1.dpad_up) {
                    Sug.setPower(0);
                    Sug2.setPower(0);
                }

                // Lift down
                if (gamepad1.cross) {
                    MPenD0.setPower(1);
                    MPenE1.setPower(1);
                } 
                // Lift up
                else if (gamepad1.triangle) {
                    MPenD0.setPower(-1);
                    MPenE1.setPower(-1);
                } 
                // Stop lift
                else {
                    MPenD0.setPower(0);
                    MPenE1.setPower(0);
                }

                // Actuator control
                if (gamepad1.circle) {
                    Ace.setPower(1);
                } 
                // Stop actuator & servos
                else if (gamepad1.square) {
                    Ace.setPower(0);
                    Sright.setPower(0);
                    Sleft.setPower(0);
                }

                // Servo rotation (continuous)
                if (gamepad1.dpad_up) {
                    Sright.setPower(1);
                    Sleft.setPower(-1);
                } 
                else if (gamepad1.dpad_down) {
                    Sleft.setPower(1);
                    Sright.setPower(-1);
                }

                // Arm servos (standard)
                if (gamepad1.dpad_right) {
                    Braleft.setPosition(130.0 / 180.0);
                    Braright.setPosition(75.0 / 180.0);
                } 
                else if (gamepad1.dpad_left) {
                    Braleft.setPosition(60.0 / 180.0);
                    Braright.setPosition(165.0 / 180.0);
                }
            }
        }
    }
}
