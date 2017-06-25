#ifndef _OrgChamomileIosUikitUIScrollViewStub_H_
#define _OrgChamomileIosUikitUIScrollViewStub_H_

#include <UIKit/UIKit.h>

#include "J2ObjC_common.h"
#include "UIKit4J_common.h"

#include "UIScrollView.h"

@interface UIScrollView (JavaUIScrollView) <OrgChamomileIosUikitUIScrollView>
@end

__attribute__((always_inline)) inline void UIScrollView_init(NSObject *self) {
    #pragma unused(self)
}

J2OBJC_EMPTY_STATIC_INIT(UIScrollView)

J2OBJC_TYPE_LITERAL_HEADER(UIScrollView)

// Empty class to force category to be loaded.
@interface JavaUIScrollViewCategoryDummy : UIScrollView
@end

#endif // _OrgChamomileIosUikitUIScrollViewStub_H_