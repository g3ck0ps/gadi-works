package il.co.gadiworks.mrnom.framework.impl;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

public class AccelerometerHandler implements SensorEventListener {
	float accelX, accelY, accelZ;
	
	public AccelerometerHandler(Context context) {
		SensorManager manager = (SensorManager)context.
			getSystemService(Context.SENSOR_SERVICE);
		
		if (manager.getSensorList(Sensor.TYPE_ACCELEROMETER).size() != 0){
			Sensor accelerometer = manager.getSensorList(
					Sensor.TYPE_ACCELEROMETER).get(0);
			manager.registerListener(this, accelerometer, 
					SensorManager.SENSOR_DELAY_GAME);
		}
	}

	@Override
	public void onAccuracyChanged(Sensor arg0, int arg1) {
		// nothing to do here
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		this.accelX = event.values[0];
		this.accelY = event.values[1];
		this.accelZ = event.values[2];
	}
	
	public float getAccelX() {
		return accelX;
	}

	public float getAccelY() {
		return accelY;
	}

	public float getAccelZ() {
		return accelZ;
	}
}