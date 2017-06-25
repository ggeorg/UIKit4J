#ifndef _OrgChamomileIosUikitUIProgressViewStub_H_
#define _OrgChamomileIosUikitUIProgressViewStub_H_

#include <UIKit/UIKit.h>

#include "J2ObjC_common.h"
#include "UIKit4J_common.h"

#include "UIProgressView.h"

@interface UIProgressView (JavaUIProgressView) <OrgChamomileIosUikitUIProgressView>
@end

__attribute__((always_inline)) inline void UIProgressView_init(NSObject *self) {
    #pragma unused(self)
}

J2OBJC_EMPTY_STATIC_INIT(UIProgressView)

J2OBJC_TYPE_LITERAL_HEADER(UIProgressView)

// Empty class to force category to be loaded.
@interface JavaUIProgressViewCategoryDummy : UIProgressView
@end

#endif // _OrgChamomileIosUikitUIProgressViewStub_H_