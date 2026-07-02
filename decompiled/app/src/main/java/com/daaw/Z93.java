package com.daaw;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final class Z93 implements AudioManager.OnAudioFocusChangeListener {
    public final Handler B;
    public final /* synthetic */ C7114oa3 C;

    public Z93(C7114oa3 c7114oa3, Handler handler) {
        this.C = c7114oa3;
        this.B = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.B.post(new Runnable() { // from class: com.daaw.W93
            @Override // java.lang.Runnable
            public final void run() {
                C7114oa3.c(this.B.C, i);
            }
        });
    }
}
