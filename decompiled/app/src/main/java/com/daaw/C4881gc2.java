package com.daaw;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.gc2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4881gc2 extends AbstractC9351wa2 {
    public boolean C;

    public C4881gc2(Set set) {
        super(set);
    }

    public final synchronized void B0() {
        A0(C4313ec2.a);
        this.C = true;
    }

    public final void zza() {
        A0(new InterfaceC9072va2() { // from class: com.daaw.dc2
            @Override // com.daaw.InterfaceC9072va2
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
            }
        });
    }

    public final void zzb() {
        A0(new InterfaceC9072va2() { // from class: com.daaw.cc2
            @Override // com.daaw.InterfaceC9072va2
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
            }
        });
    }

    public final synchronized void zzc() {
        try {
            if (!this.C) {
                A0(C4313ec2.a);
                this.C = true;
            }
            A0(new InterfaceC9072va2() { // from class: com.daaw.fc2
                @Override // com.daaw.InterfaceC9072va2
                public final void zza(Object obj) {
                    ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }
}
