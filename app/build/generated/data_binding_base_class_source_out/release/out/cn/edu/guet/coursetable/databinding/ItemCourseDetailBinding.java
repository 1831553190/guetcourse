// Generated by view binder compiler. Do not edit!
package cn.edu.guet.coursetable.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import cn.edu.guet.coursetable.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemCourseDetailBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextView dialogClassroom;

  @NonNull
  public final TextView dialogCourseName;

  @NonNull
  public final TextView dialogCourseNumber;

  @NonNull
  public final TextView dialogCourseTeacher;

  @NonNull
  public final TextView dialogCourseTime;

  @NonNull
  public final TextView dialogCourseType;

  @NonNull
  public final TextView dialogCourseWeek;

  @NonNull
  public final LinearLayout itemCBg;

  private ItemCourseDetailBinding(@NonNull FrameLayout rootView, @NonNull TextView dialogClassroom,
      @NonNull TextView dialogCourseName, @NonNull TextView dialogCourseNumber,
      @NonNull TextView dialogCourseTeacher, @NonNull TextView dialogCourseTime,
      @NonNull TextView dialogCourseType, @NonNull TextView dialogCourseWeek,
      @NonNull LinearLayout itemCBg) {
    this.rootView = rootView;
    this.dialogClassroom = dialogClassroom;
    this.dialogCourseName = dialogCourseName;
    this.dialogCourseNumber = dialogCourseNumber;
    this.dialogCourseTeacher = dialogCourseTeacher;
    this.dialogCourseTime = dialogCourseTime;
    this.dialogCourseType = dialogCourseType;
    this.dialogCourseWeek = dialogCourseWeek;
    this.itemCBg = itemCBg;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemCourseDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemCourseDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_course_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemCourseDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dialog_classroom;
      TextView dialogClassroom = rootView.findViewById(id);
      if (dialogClassroom == null) {
        break missingId;
      }

      id = R.id.dialog_course_name;
      TextView dialogCourseName = rootView.findViewById(id);
      if (dialogCourseName == null) {
        break missingId;
      }

      id = R.id.dialog_course_number;
      TextView dialogCourseNumber = rootView.findViewById(id);
      if (dialogCourseNumber == null) {
        break missingId;
      }

      id = R.id.dialog_course_teacher;
      TextView dialogCourseTeacher = rootView.findViewById(id);
      if (dialogCourseTeacher == null) {
        break missingId;
      }

      id = R.id.dialog_course_time;
      TextView dialogCourseTime = rootView.findViewById(id);
      if (dialogCourseTime == null) {
        break missingId;
      }

      id = R.id.dialog_course_type;
      TextView dialogCourseType = rootView.findViewById(id);
      if (dialogCourseType == null) {
        break missingId;
      }

      id = R.id.dialog_course_week;
      TextView dialogCourseWeek = rootView.findViewById(id);
      if (dialogCourseWeek == null) {
        break missingId;
      }

      id = R.id.item_c_bg;
      LinearLayout itemCBg = rootView.findViewById(id);
      if (itemCBg == null) {
        break missingId;
      }

      return new ItemCourseDetailBinding((FrameLayout) rootView, dialogClassroom, dialogCourseName,
          dialogCourseNumber, dialogCourseTeacher, dialogCourseTime, dialogCourseType,
          dialogCourseWeek, itemCBg);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
