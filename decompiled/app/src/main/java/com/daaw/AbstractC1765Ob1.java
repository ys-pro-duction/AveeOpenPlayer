package com.daaw;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.daaw.avee.MainActivity;

/* JADX INFO: renamed from: com.daaw.Ob1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1765Ob1 {

    /* JADX INFO: renamed from: com.daaw.Ob1$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ InterfaceC5559j2 a;

        public a(InterfaceC5559j2 interfaceC5559j2) {
            this.a = interfaceC5559j2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.a((Integer) valueAnimator.getAnimatedValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ob1$b */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ InterfaceC5559j2 a;

        public b(InterfaceC5559j2 interfaceC5559j2) {
            this.a = interfaceC5559j2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.a((Integer) valueAnimator.getAnimatedValue());
        }
    }

    public static void b() {
        AbstractC6278lb.i(Looper.myLooper() != Looper.getMainLooper());
    }

    public static void c() {
        AbstractC6278lb.i(Looper.myLooper() == Looper.getMainLooper());
    }

    public static boolean d() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static ValueAnimator e(ValueAnimator valueAnimator, InterfaceC5559j2 interfaceC5559j2, int i, long j, InterfaceC6408m2 interfaceC6408m2) {
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, 0);
        valueAnimatorOfInt.addUpdateListener(new b(interfaceC5559j2));
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.addListener(new c(interfaceC6408m2));
        valueAnimatorOfInt.start();
        return valueAnimatorOfInt;
    }

    public static ValueAnimator f(ValueAnimator valueAnimator, InterfaceC5559j2 interfaceC5559j2, int i, long j) {
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, 255);
        valueAnimatorOfInt.addUpdateListener(new a(interfaceC5559j2));
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.start();
        return valueAnimatorOfInt;
    }

    public static void g(Dialog dialog) {
        if (dialog == null) {
            return;
        }
        dialog.cancel();
    }

    public static Bitmap h(Bitmap bitmap) {
        if (bitmap == null) {
            return bitmap;
        }
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            try {
                config = Bitmap.Config.RGB_565;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            } catch (OutOfMemoryError e2) {
                e2.printStackTrace();
                return null;
            }
        }
        return bitmap.copy(config, false);
    }

    public static void i(View view, ViewParent viewParent) {
        view.setOnTouchListener(new ViewOnTouchListenerC0568Cq0(viewParent));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                i(viewGroup.getChildAt(childCount), viewParent);
            }
        }
    }

    public static void j(DialogFragment dialogFragment) {
        if (dialogFragment == null) {
            return;
        }
        try {
            dialogFragment.dismiss();
        } catch (Exception unused) {
        }
    }

    public static void k(PopupWindow popupWindow) {
        if (popupWindow != null && popupWindow.isShowing()) {
            try {
                popupWindow.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    public static void l(DialogFragment dialogFragment, String str) {
        FragmentManager fragmentManager;
        MainActivity mainActivityE1 = MainActivity.e1();
        if (mainActivityE1 == null || mainActivityE1.isFinishing() || (fragmentManager = mainActivityE1.getFragmentManager()) == null) {
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(str);
        if (fragmentFindFragmentByTag != null) {
            fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag);
        }
        try {
            dialogFragment.show(fragmentTransactionBeginTransaction, str);
        } catch (Exception unused) {
        }
    }

    public static int m(Resources.Theme theme, int i) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    public static int n(View view, int i) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().getTheme().obtainStyledAttributes(new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    public static int o(Resources.Theme theme, Context context, int i, int i2) {
        return (m(theme, i) & 16777215) | (AbstractC9438ws.c(context, i2) & (-16777216));
    }

    public static LayoutInflater p(Context context) {
        return LayoutInflater.from(context);
    }

    public static int q(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static void r(final View view) {
        if (view == null) {
            return;
        }
        int integer = view.getResources().getInteger(R.integer.config_shortAnimTime);
        view.animate().cancel();
        view.animate().withEndAction(new Runnable() { // from class: com.daaw.Nb1
            @Override // java.lang.Runnable
            public final void run() {
                view.setVisibility(4);
            }
        }).alpha(0.0f).setDuration(integer);
    }

    public static void s(View[] viewArr, View view) {
        View view2 = viewArr[0];
        if (view2 != null) {
            view2.setSelected(false);
        }
        viewArr[0] = view;
        view.setSelected(true);
    }

    public static void t(View view) {
        if (view == null) {
            return;
        }
        view.getLayoutParams().height = q(view.getContext());
    }

    public static void u(View view, int i, int i2) {
        if (view instanceof ViewGroup) {
            int i3 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i3 >= viewGroup.getChildCount()) {
                    break;
                }
                u(viewGroup.getChildAt(i3), i, i2);
                i3++;
            }
        }
        if (!(view instanceof TextView)) {
            if (view instanceof ImageView) {
                ((ImageView) view).setColorFilter(i);
            }
        } else {
            TextView textView = (TextView) view;
            textView.setTextColor(i);
            textView.setHintTextColor(i2);
            textView.setLinkTextColor(i2);
        }
    }

    public static void v(View view) {
        if (view == null) {
            return;
        }
        int integer = view.getResources().getInteger(R.integer.config_shortAnimTime);
        view.animate().cancel();
        view.animate().withEndAction(null);
        view.setVisibility(0);
        view.animate().alpha(1.0f).setDuration(integer);
    }

    public static void w(DialogFragment dialogFragment, String str) {
        FragmentManager fragmentManager;
        MainActivity mainActivityE1 = MainActivity.e1();
        if (mainActivityE1 == null || mainActivityE1.isFinishing() || (fragmentManager = mainActivityE1.getFragmentManager()) == null) {
            return;
        }
        try {
            dialogFragment.show(fragmentManager, str);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ob1$c */
    public class c implements Animator.AnimatorListener {
        public boolean a = false;
        public final /* synthetic */ InterfaceC6408m2 b;

        public c(InterfaceC6408m2 interfaceC6408m2) {
            this.b = interfaceC6408m2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            this.b.a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
