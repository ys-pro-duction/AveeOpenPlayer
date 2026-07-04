package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import com.daaw.AbstractC0413Bd1;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0413Bd1 abstractC0413Bd1) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) abstractC0413Bd1.v(remoteActionCompat.a, 1);
        remoteActionCompat.b = abstractC0413Bd1.l(remoteActionCompat.b, 2);
        remoteActionCompat.c = abstractC0413Bd1.l(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) abstractC0413Bd1.r(remoteActionCompat.d, 4);
        remoteActionCompat.e = abstractC0413Bd1.h(remoteActionCompat.e, 5);
        remoteActionCompat.f = abstractC0413Bd1.h(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0413Bd1 abstractC0413Bd1) {
        abstractC0413Bd1.x(false, false);
        abstractC0413Bd1.M(remoteActionCompat.a, 1);
        abstractC0413Bd1.D(remoteActionCompat.b, 2);
        abstractC0413Bd1.D(remoteActionCompat.c, 3);
        abstractC0413Bd1.H(remoteActionCompat.d, 4);
        abstractC0413Bd1.z(remoteActionCompat.e, 5);
        abstractC0413Bd1.z(remoteActionCompat.f, 6);
    }
}
