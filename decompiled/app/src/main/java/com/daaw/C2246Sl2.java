package com.daaw;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: renamed from: com.daaw.Sl2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2246Sl2 implements SensorEventListener {
    public final Context a;
    public SensorManager b;
    public Sensor c;
    public long d;
    public int e;
    public InterfaceC2140Rl2 f;
    public boolean g;

    public C2246Sl2(Context context) {
        this.a = context;
    }

    public final void a() {
        synchronized (this) {
            try {
                if (this.g) {
                    SensorManager sensorManager = this.b;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.c);
                        zze.zza("Stopped listening for shake gestures.");
                    }
                    this.g = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.J8)).booleanValue()) {
                    if (this.b == null) {
                        SensorManager sensorManager2 = (SensorManager) this.a.getSystemService("sensor");
                        this.b = sensorManager2;
                        if (sensorManager2 == null) {
                            AbstractC4274eT1.zzj("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.c = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.g && (sensorManager = this.b) != null && (sensor = this.c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.d = zzt.zzB().a() - ((long) ((Integer) zzba.zzc().b(AbstractC9820yE1.L8)).intValue());
                        this.g = true;
                        zze.zza("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(InterfaceC2140Rl2 interfaceC2140Rl2) {
        this.f = interfaceC2140Rl2;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.J8)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f2 = fArr[1] / 9.80665f;
            float f3 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3))) < ((Float) zzba.zzc().b(AbstractC9820yE1.K8)).floatValue()) {
                return;
            }
            long jA = zzt.zzB().a();
            if (this.d + ((long) ((Integer) zzba.zzc().b(AbstractC9820yE1.L8)).intValue()) > jA) {
                return;
            }
            if (this.d + ((long) ((Integer) zzba.zzc().b(AbstractC9820yE1.M8)).intValue()) < jA) {
                this.e = 0;
            }
            zze.zza("Shake detected.");
            this.d = jA;
            int i = this.e + 1;
            this.e = i;
            InterfaceC2140Rl2 interfaceC2140Rl2 = this.f;
            if (interfaceC2140Rl2 != null) {
                if (i == ((Integer) zzba.zzc().b(AbstractC9820yE1.N8)).intValue()) {
                    C7447pl2 c7447pl2 = (C7447pl2) interfaceC2140Rl2;
                    c7447pl2.h(new BinderC6610ml2(c7447pl2), EnumC7168ol2.GESTURE);
                }
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
