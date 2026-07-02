package com.daaw;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.hx2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5262hx2 implements InterfaceC1447Kz2 {
    public final PS2 a;
    public final Context b;

    public C5262hx2(PS2 ps2, Context context) {
        this.a = ps2;
        this.b = context;
    }

    public final /* synthetic */ C5539ix2 a() {
        int iZzk;
        int streamMaxVolume;
        AudioManager audioManager = (AudioManager) this.b.getSystemService("audio");
        int mode = audioManager.getMode();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ba)).booleanValue()) {
            iZzk = zzt.zzq().zzk(audioManager);
            streamMaxVolume = audioManager.getStreamMaxVolume(3);
        } else {
            iZzk = -1;
            streamMaxVolume = -1;
        }
        return new C5539ix2(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, iZzk, streamMaxVolume, audioManager.getRingerMode(), audioManager.getStreamVolume(2), zzt.zzr().zza(), zzt.zzr().zze());
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 13;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return this.a.S0(new Callable() { // from class: com.daaw.gx2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}
