/*
 * PROJECT: Alarm Clock
 * DESCRIPTION: A simple clock where it plays a sound after X number of minutes/seconds 
 * 				or at a particular time.
 * COMPLETED:
 */

package Numbers;

import java.util.Scanner;
import java.applet.*;
import java.net.*;

public class AlarmClock {

	public static void main(String[] args) {
		try{
			AudioClip alarmClock= Applet.newAudioClip(new URL("file://d:/Large file storage/Programming/Java/Eclipse/Workspace/Mega Project List/data/alarmClock.wav"));
			alarmClock.play();
		}
		catch (MalformedURLException murle){
			System.out.println(murle);
		}
	}

}
