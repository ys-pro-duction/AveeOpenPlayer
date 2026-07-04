package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import com.daaw.AbstractDialogC7837r9;
import com.daaw.KC0;

/* JADX INFO: loaded from: classes.dex */
public class a extends AbstractDialogC7837r9 implements DialogInterface {
    public final AlertController G;

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0003a {
        public final AlertController.f a;
        public final int b;

        public C0003a(Context context) {
            this(context, a.l(context, 0));
        }

        public a a() {
            a aVar = new a(this.a.a, this.b);
            this.a.a(aVar.G);
            aVar.setCancelable(this.a.r);
            if (this.a.r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.a.s);
            aVar.setOnDismissListener(this.a.t);
            DialogInterface.OnKeyListener onKeyListener = this.a.u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }

        public Context b() {
            return this.a.a;
        }

        public C0003a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            return this;
        }

        public C0003a d(View view) {
            this.a.g = view;
            return this;
        }

        public C0003a e(Drawable drawable) {
            this.a.d = drawable;
            return this;
        }

        public C0003a f(CharSequence charSequence) {
            this.a.h = charSequence;
            return this;
        }

        public C0003a g(DialogInterface.OnKeyListener onKeyListener) {
            this.a.u = onKeyListener;
            return this;
        }

        public C0003a h(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            fVar.I = i;
            fVar.H = true;
            return this;
        }

        public C0003a i(CharSequence charSequence) {
            this.a.f = charSequence;
            return this;
        }

        public C0003a(Context context, int i) {
            this.a = new AlertController.f(new ContextThemeWrapper(context, a.l(context, i)));
            this.b = i;
        }
    }

    public a(Context context, int i) {
        super(context, l(context, i));
        this.G = new AlertController(getContext(), this, getWindow());
    }

    public static int l(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(KC0.l, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView k() {
        return this.G.d();
    }

    @Override // com.daaw.AbstractDialogC7837r9, com.daaw.DialogC9139vo, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.G.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.G.g(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.G.h(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // com.daaw.AbstractDialogC7837r9, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.G.q(charSequence);
    }
}
