package com.daaw.avee.comp.playback;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.daaw.InterfaceC1688Ni0;

/* JADX INFO: loaded from: classes.dex */
public class MediaButtonEventReceiver extends BroadcastReceiver {
    public static Handler a = null;
    public static long b = 0;
    public static boolean c = false;
    public static boolean d = false;

    public MediaButtonEventReceiver() {
        a = new Handler(new Handler.Callback() { // from class: com.daaw.ai0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.B.b(message);
            }
        });
    }

    public final /* synthetic */ boolean b(Message message) {
        if (message.what != 1 || d) {
            return false;
        }
        c((Context) message.obj, "HEADSET_ASSIST_ACTION");
        d = true;
        return false;
    }

    public void c(Context context, String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName(context, (Class<?>) InterfaceC1688Ni0.l));
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onReceive(android.content.Context r14, android.content.Intent r15) {
        /*
            r13 = this;
            java.lang.String r0 = r15.getAction()
            java.lang.String r1 = "android.intent.action.MEDIA_BUTTON"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Laa
            java.lang.String r0 = "android.intent.extra.KEY_EVENT"
            android.os.Parcelable r15 = r15.getParcelableExtra(r0)
            android.view.KeyEvent r15 = (android.view.KeyEvent) r15
            if (r15 != 0) goto L18
            goto Laa
        L18:
            int r0 = r15.getKeyCode()
            int r1 = r15.getAction()
            long r2 = r15.getEventTime()
            java.lang.String r4 = "TOGGLE_PAUSE_ACTION"
            java.lang.String r5 = "NEXT_ACTION"
            java.lang.String r6 = "PLAY_ACTION"
            r7 = 79
            if (r0 == r7) goto L48
            r8 = 126(0x7e, float:1.77E-43)
            if (r0 == r8) goto L46
            r8 = 127(0x7f, float:1.78E-43)
            if (r0 == r8) goto L43
            switch(r0) {
                case 85: goto L48;
                case 86: goto L40;
                case 87: goto L3e;
                case 88: goto L3b;
                default: goto L39;
            }
        L39:
            r8 = 0
            goto L49
        L3b:
            java.lang.String r8 = "PREVIOUS_ACTION"
            goto L49
        L3e:
            r8 = r5
            goto L49
        L40:
            java.lang.String r8 = "STOP_ACTION"
            goto L49
        L43:
            java.lang.String r8 = "PAUSE_ACTION"
            goto L49
        L46:
            r8 = r6
            goto L49
        L48:
            r8 = r4
        L49:
            if (r8 == 0) goto Laa
            r9 = 0
            r10 = 1
            if (r1 != 0) goto L9a
            boolean r1 = com.daaw.avee.comp.playback.MediaButtonEventReceiver.c
            r11 = 0
            if (r1 == 0) goto L78
            boolean r15 = r4.equals(r8)
            if (r15 != 0) goto L61
            boolean r15 = r6.equals(r8)
            if (r15 == 0) goto La1
        L61:
            long r0 = com.daaw.avee.comp.playback.MediaButtonEventReceiver.b
            int r15 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r15 == 0) goto La1
            long r2 = r2 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            int r15 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r15 <= 0) goto La1
            android.os.Handler r15 = com.daaw.avee.comp.playback.MediaButtonEventReceiver.a
            android.os.Message r14 = r15.obtainMessage(r10, r14)
            r15.sendMessage(r14)
            goto La1
        L78:
            int r15 = r15.getRepeatCount()
            if (r15 != 0) goto La1
            if (r0 != r7) goto L90
            long r0 = com.daaw.avee.comp.playback.MediaButtonEventReceiver.b
            long r0 = r2 - r0
            r6 = 300(0x12c, double:1.48E-321)
            int r15 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r15 >= 0) goto L90
            r13.c(r14, r5)
            com.daaw.avee.comp.playback.MediaButtonEventReceiver.b = r11
            goto L95
        L90:
            r13.c(r14, r8)
            com.daaw.avee.comp.playback.MediaButtonEventReceiver.b = r2
        L95:
            com.daaw.avee.comp.playback.MediaButtonEventReceiver.d = r9
            com.daaw.avee.comp.playback.MediaButtonEventReceiver.c = r10
            goto La1
        L9a:
            android.os.Handler r14 = com.daaw.avee.comp.playback.MediaButtonEventReceiver.a
            r14.removeMessages(r10)
            com.daaw.avee.comp.playback.MediaButtonEventReceiver.c = r9
        La1:
            boolean r14 = r13.isOrderedBroadcast()
            if (r14 == 0) goto Laa
            r13.abortBroadcast()
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.avee.comp.playback.MediaButtonEventReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
