package com.daaw;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: renamed from: com.daaw.Zk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2970Zk2 implements SensorEventListener {
    public final SensorManager a;
    public final Sensor b;
    public float c = 0.0f;
    public Float d = Float.valueOf(0.0f);
    public long e = zzt.zzB().a();
    public int f = 0;
    public boolean g = false;
    public boolean h = false;
    public InterfaceC2866Yk2 i = null;
    public boolean j = false;

    public C2970Zk2(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.a = sensorManager;
        if (sensorManager != null) {
            this.b = sensorManager.getDefaultSensor(4);
        } else {
            this.b = null;
        }
    }

    public final void a() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.j && (sensorManager = this.a) != null && (sensor = this.b) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.j = false;
                    zze.zza("Stopped listening for flick gestures.");
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
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.O8)).booleanValue()) {
                    if (!this.j && (sensorManager = this.a) != null && (sensor = this.b) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.j = true;
                        zze.zza("Listening for flick gestures.");
                    }
                    if (this.a == null || this.b == null) {
                        AbstractC4274eT1.zzj("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(InterfaceC2866Yk2 interfaceC2866Yk2) {
        this.i = interfaceC2866Yk2;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.O8)).booleanValue()) {
            long jA = zzt.zzB().a();
            if (this.e + ((long) ((Integer) zzba.zzc().b(AbstractC9820yE1.Q8)).intValue()) < jA) {
                this.f = 0;
                this.e = jA;
                this.g = false;
                this.h = false;
                this.c = this.d.floatValue();
            }
            Float fValueOf = Float.valueOf(this.d.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.d = fValueOf;
            float fFloatValue = fValueOf.floatValue();
            float f = this.c;
            AbstractC7582qE1 abstractC7582qE1 = AbstractC9820yE1.P8;
            if (fFloatValue > f + ((Float) zzba.zzc().b(abstractC7582qE1)).floatValue()) {
                this.c = this.d.floatValue();
                this.h = true;
            } else if (this.d.floatValue() < this.c - ((Float) zzba.zzc().b(abstractC7582qE1)).floatValue()) {
                this.c = this.d.floatValue();
                this.g = true;
            }
            if (this.d.isInfinite()) {
                this.d = Float.valueOf(0.0f);
                this.c = 0.0f;
            }
            if (this.g && this.h) {
                zze.zza("Flick detected.");
                this.e = jA;
                int i = this.f + 1;
                this.f = i;
                this.g = false;
                this.h = false;
                InterfaceC2866Yk2 interfaceC2866Yk2 = this.i;
                if (interfaceC2866Yk2 != null) {
                    if (i == ((Integer) zzba.zzc().b(AbstractC9820yE1.R8)).intValue()) {
                        C7447pl2 c7447pl2 = (C7447pl2) interfaceC2866Yk2;
                        c7447pl2.h(new BinderC6889nl2(c7447pl2), EnumC7168ol2.GESTURE);
                    }
                }
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
