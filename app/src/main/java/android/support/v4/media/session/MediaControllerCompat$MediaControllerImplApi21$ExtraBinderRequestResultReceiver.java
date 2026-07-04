package android.support.v4.media.session;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.daaw.AbstractC6314li0;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {
    public WeakReference B;

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        AbstractC6314li0.a(this.B.get());
    }
}
