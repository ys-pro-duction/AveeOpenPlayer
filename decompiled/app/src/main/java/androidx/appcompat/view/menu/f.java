package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.i;
import com.daaw.DD0;

/* JADX INFO: loaded from: classes.dex */
public class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, i.a {
    public e B;
    public androidx.appcompat.app.a C;
    public c D;
    public i.a E;

    public f(e eVar) {
        this.B = eVar;
    }

    public void a() {
        androidx.appcompat.app.a aVar = this.C;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.i.a
    public void b(e eVar, boolean z) {
        if (z || eVar == this.B) {
            a();
        }
        i.a aVar = this.E;
        if (aVar != null) {
            aVar.b(eVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.i.a
    public boolean c(e eVar) {
        i.a aVar = this.E;
        if (aVar != null) {
            return aVar.c(eVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        e eVar = this.B;
        a.C0003a c0003a = new a.C0003a(eVar.w());
        c cVar = new c(c0003a.b(), DD0.j);
        this.D = cVar;
        cVar.g(this);
        this.B.b(this.D);
        c0003a.c(this.D.a(), this);
        View viewA = eVar.A();
        if (viewA != null) {
            c0003a.d(viewA);
        } else {
            c0003a.e(eVar.y()).i(eVar.z());
        }
        c0003a.g(this);
        androidx.appcompat.app.a aVarA = c0003a.a();
        this.C = aVarA;
        aVarA.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.C.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.C.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.B.O((g) this.D.a().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.D.b(this.B, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.C.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.C.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.B.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.B.performShortcut(i, keyEvent, 0);
    }
}
