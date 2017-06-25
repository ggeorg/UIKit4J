#ifndef _OrgChamomileIosUikitUITextViewStub_H_
#define _OrgChamomileIosUikitUITextViewStub_H_

#include <UIKit/UIKit.h>

#include "J2ObjC_common.h"
#include "UIKit4J_common.h"

#include "UITextView.h"

@interface UITextView (JavaUITextView) <OrgChamomileIosUikitUITextView>
@end

__attribute__((always_inline)) inline void UITextView_init(NSObject *self) {
    #pragma unused(self)
}

J2OBJC_EMPTY_STATIC_INIT(UITextView)

J2OBJC_TYPE_LITERAL_HEADER(UITextView)

// Empty class to force category to be loaded.
@interface JavaUITextViewCategoryDummy : UITextView
@end

#endif // _OrgChamomileIosUikitUITextViewStub_H_