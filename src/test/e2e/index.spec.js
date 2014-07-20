describe('meetwhenwhere homepage', function() {
    it('should display correct title', function() {
        browser.get('http://localhost:9090/MeetWhenWhere');
        expect(browser.getTitle()).toBe("MeetWhenWhere!");
//        expect('hello').toEqual('hello');
    });
});
