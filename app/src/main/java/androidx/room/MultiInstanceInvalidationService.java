package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import androidx.room.b;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {
    public int B = 0;
    public final HashMap C = new HashMap();
    public final RemoteCallbackList D = new a();
    public final b.a E = new b();

    public class a extends RemoteCallbackList {
        public a() {
        }

        @Override // android.os.RemoteCallbackList
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(androidx.room.a aVar, Object obj) {
            HashMap map = MultiInstanceInvalidationService.this.C;
            Integer num = (Integer) obj;
            num.intValue();
            map.remove(num);
        }
    }

    public class b extends b.a {
        public b() {
        }

        @Override // androidx.room.b
        public int D0(androidx.room.a aVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.D) {
                try {
                    MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                    int i = multiInstanceInvalidationService.B + 1;
                    multiInstanceInvalidationService.B = i;
                    if (multiInstanceInvalidationService.D.register(aVar, Integer.valueOf(i))) {
                        MultiInstanceInvalidationService.this.C.put(Integer.valueOf(i), str);
                        return i;
                    }
                    MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                    multiInstanceInvalidationService2.B--;
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.room.b
        public void E2(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.D) {
                try {
                    String str = (String) MultiInstanceInvalidationService.this.C.get(Integer.valueOf(i));
                    if (str == null) {
                        return;
                    }
                    int iBeginBroadcast = MultiInstanceInvalidationService.this.D.beginBroadcast();
                    for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                        try {
                            Integer num = (Integer) MultiInstanceInvalidationService.this.D.getBroadcastCookie(i2);
                            int iIntValue = num.intValue();
                            String str2 = (String) MultiInstanceInvalidationService.this.C.get(num);
                            if (i != iIntValue && str.equals(str2)) {
                                try {
                                    ((androidx.room.a) MultiInstanceInvalidationService.this.D.getBroadcastItem(i2)).m0(strArr);
                                } catch (RemoteException unused) {
                                }
                            }
                        } finally {
                            MultiInstanceInvalidationService.this.D.finishBroadcast();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.room.b
        public void T2(androidx.room.a aVar, int i) {
            synchronized (MultiInstanceInvalidationService.this.D) {
                MultiInstanceInvalidationService.this.D.unregister(aVar);
                MultiInstanceInvalidationService.this.C.remove(Integer.valueOf(i));
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.E;
    }
}
