// Generated by view binder compiler. Do not edit!
package cn.edu.guet.coursetable.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import cn.edu.guet.coursetable.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogCourseDetailBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RecyclerView dialogDetialRecyclerView;

  private DialogCourseDetailBinding(@NonNull LinearLayout rootView,
      @NonNull RecyclerView dialogDetialRecyclerView) {
    this.rootView = rootView;
    this.dialogDetialRecyclerView = dialogDetialRecyclerView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogCourseDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogCourseDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_course_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogCourseDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dialog_detial_recyclerView;
      RecyclerView dialogDetialRecyclerView = rootView.findViewById(id);
      if (dialogDetialRecyclerView == null) {
        break missingId;
      }

      return new DialogCourseDetailBinding((LinearLayout) rootView, dialogDetialRecyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
