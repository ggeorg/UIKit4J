#ifndef _OrgChamomileIosUikitUIViewStub_H_
#define _OrgChamomileIosUikitUIViewStub_H_

#include <UIKit/UIKit.h>

#include "J2ObjC_common.h"
#include "UIKit4J_common.h"

#include "UIView.h"

@interface UIView (JavaUIView) <OrgChamomileIosUikitUIView>
@end

__attribute__((always_inline)) inline void UIView_init(NSObject *self) {
    #pragma unused(self)
}

J2OBJC_EMPTY_STATIC_INIT(UIView)

J2OBJC_TYPE_LITERAL_HEADER(UIView)

// Empty class to force category to be loaded.
@interface JavaUIViewCategoryDummy : UIView
@end

#endif // _OrgChamomileIosUikitUIViewStub_H_