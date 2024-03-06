package frc.robot.subsystems;


import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ClimberSubsystem extends SubsystemBase{
    

  private CANSparkMax m_leftClimber;
  private CANSparkMax m_rightClimber;

    public ClimberSubsystem() {
    m_leftClimber =
        new CANSparkMax(Constants.Climbers.KleftClimberID, CANSparkMaxLowLevel.MotorType.kBrushless);
    m_leftClimber.setInverted(true);
    m_leftClimber.setSmartCurrentLimit(Constants.Climbers.kCurrentLimit);
    m_leftClimber.setIdleMode(IdleMode.kBrake);

    m_leftClimber.burnFlash();

    m_rightClimber =
        new CANSparkMax(Constants.Climbers.KrightClimberID, CANSparkMaxLowLevel.MotorType.kBrushless);
    m_rightClimber.setInverted(true);
    m_rightClimber.setSmartCurrentLimit(Constants.Climbers.kCurrentLimit);
    m_rightClimber.setIdleMode(IdleMode.kBrake);

    m_rightClimber.burnFlash();
    }
    
    
    
    public void runMotor(double x){
        m_leftClimber.set(x);
        m_rightClimber.set(x);
    }
}
